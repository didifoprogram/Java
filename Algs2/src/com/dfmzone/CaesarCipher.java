package com.dfmzone;

public class CaesarCipher {

    protected char[] encoder;
    protected char[] decoder;


    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(3);
        System.out.println(cipher.encrypt("DIEGO"));
        System.out.println(cipher.decrypt("GLHJR"));
    }

    public CaesarCipher(int rotation) {
        encoder = new char[26];
        decoder = new char[26];

        for (int k = 0; k < 26; k++) {
            encoder[k] = (char) ('A' + (k + rotation) % 26);
            decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
        }
    }

    public String encrypt(String message) {
        return transform(message, encoder);
    }

    public String decrypt(String message) {
        return transform(message, decoder);
    }

    public String transform(String original, char[] code) {
        char[] msg = original.toCharArray();

        for (int i = 0; i < msg.length; i++) {
            if (Character.isUpperCase(msg[i])) {
                msg[i] = code[msg[i] - 'A'];
            }
        }
        return new String(msg);
    }
}
