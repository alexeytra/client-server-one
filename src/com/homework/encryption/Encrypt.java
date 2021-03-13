package com.homework.encryption;

public class Encrypt {
    public static void main(String[] args) {
        String text = "МАМА МЫЛА РАМУ";
        String key = "ДЕНЬ";

        IEncryptAlgorithm gammaEncryption = new GammaEncryption();
        String enc = gammaEncryption.encrypt(text, key);
        String dec = gammaEncryption.decrypt(enc, key);

        System.out.println("Encrypted " + enc);
        System.out.println("Decrypted " + dec);

        boolean a = true;

        if (a) {
            System.out.println(a);
        }

    }
}
