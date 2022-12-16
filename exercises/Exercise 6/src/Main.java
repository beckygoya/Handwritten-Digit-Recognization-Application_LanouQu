public class Main {
    public static void main(String[] args) throws Exception {
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");

        Symmetric symmetric = new Symmetric();
        alice.updateEncryption(symmetric);
        bob.updateEncryption(symmetric);
        alice.sendEncryptedMessage( "Hello, welcome to the Northeastern University.", bob);

        Asymmetric asymmetric = new Asymmetric();
        alice.updateEncryption(asymmetric);
        bob.updateEncryption(asymmetric);
        bob.sendEncryptedMessage( "Thank you, I'm very excited to be here.", alice);

        Signature signature = new Signature();
        alice.updateSignature(signature);
        bob.updateSignature(signature);
        alice.sendSignedMessage("Glad to hear that!", bob);

        alice.end();
        bob.end();
    }
}
