package com.homework.encryption;

public interface IEncryptAlgorithm {
    String encrypt(String text, String key);

    String decrypt(String code, String key);
}
