package NumberRecognizer;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.WritableImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class CanvasDigitImageRecognizerImpl implements DigitImageRecognizer {
    private Canvas canvas;
    private ImageFactory imageFactory;

    public CanvasDigitImageRecognizerImpl(Canvas canvas) {
        this.imageFactory = new ImageFactory(28);
        this.canvas = canvas;
    }

    @Override
    public String saveImage() {
        WritableImage drawn = new WritableImage((int) canvas.getWidth(), (int) canvas.getHeight());
        WritableImage snapshot = canvas.snapshot(new SnapshotParameters(), drawn);
        BufferedImage finalImage = imageFactory.createImage(snapshot);
        String fileName = "saved.png";
        File outputfile = new File(fileName);
        try {
            ImageIO.write(finalImage, "png", outputfile);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new IllegalArgumentException("Cannot save the input digit image!");
        }
        return fileName;
    }

    @Override
    public Integer predict(String imageName) {
        String lastLine = "-1";
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"python3", "CallModel.py", saveImage()});
            InputStream stdout = process.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stdout, StandardCharsets.UTF_8));
            String curLine = reader.readLine();
            while (curLine != null) {
                lastLine = curLine;
                curLine = reader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Failed to read from python output.");
            throw new IllegalStateException("Unknown python output.");
        }
        return Integer.valueOf(lastLine);
    }
}
