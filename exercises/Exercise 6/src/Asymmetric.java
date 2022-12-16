import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;

public class Asymmetric implements Encryption {
    private final KeyPair pair;
    private final Cipher cipher;

    Asymmetric() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        pair = keyPairGen.generateKeyPair();
        cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }

    // encrypt the message
    public byte[] encrypt(String message) throws Exception {
        PublicKey publicKey = pair.getPublic();
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        return cipher.doFinal(message.getBytes());
    }

    // decrypt the message
    public String decrypt(byte[] encryptedMessage) throws Exception {
        cipher.init(Cipher.DECRYPT_MODE, pair.getPrivate());
        byte[] decipheredText = cipher.doFinal(encryptedMessage);
        return new String(decipheredText, "UTF8");
    }
}
