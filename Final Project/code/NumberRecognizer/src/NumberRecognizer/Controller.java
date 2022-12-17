package NumberRecognizer;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.io.*;

public class Controller {
    @FXML
    private Button draw;
    @FXML
    private Canvas canvas;
    @FXML
    private Button recognize;
    @FXML
    private Button clear;
    @FXML
    private GraphicsContext context;
    @FXML
    private Label result;

    // draw on the canvas
    @FXML
    private void getContext() {
        context = canvas.getGraphicsContext2D();
        context.setStroke(Color.BLACK);
        context.setLineWidth(25);

        canvas.setOnMousePressed(e -> {
            context.beginPath();
            context.lineTo(e.getX(), e.getY());
            context.stroke();
        });

        canvas.setOnMouseDragged(e -> {
            context.lineTo(e.getX(), e.getY());
            context.stroke();
        });
    }

    // clear the canvas
    @FXML
    private void clearCanvas() throws IOException {
        result.setText("");
        if (context != null) {
            context.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        }
    }

    // recognize the image
    @FXML
    private void recognizeImage() {
        result.setText("-1");
        if (context != null) {
            DigitImageRecognizer digitImageRecognizer = new CanvasDigitImageRecognizerImpl(canvas);
            String imageName = digitImageRecognizer.saveImage();
            Integer predictedNumber = digitImageRecognizer.predict(imageName);
            result.setText(predictedNumber.toString());
        }
    }
}
