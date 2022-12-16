import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;

public class Signature {

    private final KeyPair pair;
    private final java.security.Signature sign;

    Signature() throws Exception {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
        keyPairGen.initialize(2048);
        pair = keyPairGen.generateKeyPair();
        sign = java.security.Signature.getInstance("SHA256withRSA");
    }

    // create a signature
    public byte[] sign(String message) throws Exception {
        PrivateKey privateKey = pair.getPrivate();
        sign.initSign(privateKey);
        sign.update(message.getBytes());
        return sign.sign();
    }

    // verify the signature
    public boolean verify(String message, byte[] signedMessage) throws Exception {
        sign.initVerify(pair.getPublic());
        sign.update(message.getBytes());
        return sign.verify(signedMessage);
    }
}
