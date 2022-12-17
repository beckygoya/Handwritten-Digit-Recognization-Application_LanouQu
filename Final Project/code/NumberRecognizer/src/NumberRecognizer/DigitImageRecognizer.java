package NumberRecognizer;

public interface DigitImageRecognizer {
    String saveImage();

    Integer predict(String imageName);
}
