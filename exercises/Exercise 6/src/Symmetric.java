import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.GCMParameterSpec;
import java.security.Key;

public class Symmetric implements Encryption {
    private final Cipher cipher;
    private final Key key;

    Symmetric() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        key = keyGen.generateKey();
        cipher = Cipher.getInstance("AES/GCM/NoPadding");
    }

    // encrypt the message
    public byte[] encrypt(String message) throws Exception {
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] messageBytes = message.getBytes();
        return cipher.doFinal(messageBytes);
    }

    // decrypt the message
    public String decrypt(byte[] encryptedMessage) throws Exception {
        GCMParameterSpec spec = new GCMParameterSpec(128, cipher.getIV());
        cipher.init(Cipher.DECRYPT_MODE, key, spec);
        cipher.update(encryptedMessage);
        byte[] decipheredText = cipher.doFinal();
        return new String(decipheredText, "UTF8");
    }
}
