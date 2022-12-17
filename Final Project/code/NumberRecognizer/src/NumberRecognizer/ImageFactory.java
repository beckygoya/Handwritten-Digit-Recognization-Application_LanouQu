package NumberRecognizer;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;

import java.awt.*;
import java.awt.image.BufferedImage;

// simple factory pattern
public final class ImageFactory {
    private final int size;

    ImageFactory(int size) {
        this.size = size;
    }

    public BufferedImage createImage(WritableImage writableImage) {
        BufferedImage fxImage = SwingFXUtils.fromFXImage(writableImage, null);
        BufferedImage finalImage = new BufferedImage(size, size, BufferedImage.TYPE_BYTE_GRAY);
        finalImage.getGraphics().drawImage(fxImage.getScaledInstance(size, size, Image.SCALE_SMOOTH), 0, 0, null);
        return finalImage;
    }
}
