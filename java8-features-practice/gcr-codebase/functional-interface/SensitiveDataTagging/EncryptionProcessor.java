package SensitiveDataTagging;

public class EncryptionProcessor {
	public static void process(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Sensitive data detected!");
            encrypt(obj);
        } else {
            System.out.println("Normal data. No encryption needed.");
        }
    }

    private static void encrypt(Object obj) {
        
        System.out.println("Encrypting data for: " + obj.getClass().getSimpleName());
    }
}
