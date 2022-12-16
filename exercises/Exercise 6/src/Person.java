import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Person {
    String name;
    private Encryption encryption;
    private Signature signature;
    BufferedWriter writer;

    Person(String name) throws Exception {
        this.name = name;
        FileOutputStream fos = new FileOutputStream(String.format("%s.txt", name));
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        this.writer = new BufferedWriter(osw);
    }

    public void updateEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    public void updateSignature(Signature signature) {
        this.signature = signature;
    }

    public void sendEncryptedMessage(String message, Person receiver) throws Exception {
        byte[] encryptedMessage = encryption.encrypt(message);
        writer.append(String.format("%s sends `%s`.%n", this.name, new String(encryptedMessage, StandardCharsets.UTF_8)));
        String decryptedMessage = receiver.encryption.decrypt(encryptedMessage);
        receiver.writer.append(String.format("%s received message `%s`.%n", receiver.name, decryptedMessage));
    }

    public void sendSignedMessage(String message, Person receiver) throws Exception {
        byte[] signature = this.signature.sign(message);
        writer.append(String.format("%s sends `%s`, signature is `%s`.%n", this.name, message,
                new String(signature, StandardCharsets.UTF_8)));
        if (receiver.signature.verify(message, signature)) {
            receiver.writer.append(String.format("%s receives verified message `%s` from %s.%n", receiver.name, message, this.name));
        } else {
            receiver.writer.append("Signature verification failed.");
        }
    }

    public void end() throws Exception {
        writer.flush();
    }
}
