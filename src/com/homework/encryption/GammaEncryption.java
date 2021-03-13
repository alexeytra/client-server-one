package com.homework.encryption;

import java.util.ArrayList;

public class GammaEncryption implements IEncryptAlgorithm {
    private int n = Alphabet.alphabet44.size();
    private ArrayList<Integer> tNumText;
    private ArrayList<Integer> gNumText;

    @Override
    public String encrypt(String text, String key) {
        StringBuilder encryptedText = new StringBuilder();
        this.revertToNum(text, key);
        for (int i = 0; i < tNumText.size(); i++) {
            int res = (tNumText.get(i) + gNumText.get(i)) % Alphabet.alphabet44.size();
            if (res != 0)
                encryptedText.append(Alphabet.numAlphabet44.get(res));
            else
                encryptedText.append(Alphabet.numAlphabet44.get(this.n));
        }
        return encryptedText.toString();
    }

    @Override
    public String decrypt(String code, String key) {
        StringBuilder decryptedText = new StringBuilder();
        this.revertToNum(code, key);
        for (int i = 0; i < tNumText.size(); i++) {
            int res = ((tNumText.get(i) - gNumText.get(i)) + this.n) % Alphabet.alphabet44.size();
            if (res != 0)
                decryptedText.append(Alphabet.numAlphabet44.get(res));
            else
                decryptedText.append(Alphabet.numAlphabet44.get(Alphabet.alphabet44.size()));
        }
        return decryptedText.toString();
    }

    private void revertToNum(String text, String key) {
        tNumText = new ArrayList<>();
        gNumText = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            if (k >= key.length())
                k = 0;
            tNumText.add(Alphabet.alphabet44.get(text.charAt(i)));
            gNumText.add(Alphabet.alphabet44.get(key.charAt(k)));
            k++;
        }
    }
}
