public interface Encryption {
    byte[] encrypt(String message) throws Exception;

    String decrypt(byte[] encryptedMessage) throws Exception;
}
