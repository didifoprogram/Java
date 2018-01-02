package com.dfmzone;

public class CaesarCipher {

    protected char[] encoder = new char[26]; // encrypt
    protected char[] decoder = new char[26]; // decrypt

    public static void main(String[] args) {

        CaesarCipher cipher = new CaesarCipher(4);

        System.out.println(cipher.encrypt("MY NAME IS DIEGO"));
        System.out.println(cipher.decrypt("PB QDPH LV GLHJR"));
    }

    public CaesarCipher(int rotation) {
        for (int k = 0; k < 26; k++) {
            encoder[k] = (char) ('A' + (k + rotation) % 26); // Use mod to wrap at the end... when k = 25 > (25 + 3) % 26 = 2 = 'C'
            decoder[k] = (char) ('A' + (k - rotation + 26) % 26); // Here when k = 0 > (0 - 3 + 26) % 26 = 23 = 'X'
        }
    }

    public String encrypt(String message) {
        return transform(message, encoder);
    }

    public String decrypt(String message) {
        return transform(message, decoder);
    }

    private String transform(String original, char[] code) {
        char[] msg = original.toCharArray(); // Transform the String to a char array
        for (int k = 0; k < msg.length; k++) {
            if (Character.isUpperCase(msg[k])) { // check if the char we're at is upper case
                int j = msg[k] - 'A'; // assign j to msg[k] - 'A' so we can take the unicode point for the current letter
                msg[k] = code[j]; // take the current position and assign to the element of the same position in the encoder array code[]
            }
        }
        return new String(msg); // Transform the array msg[] to a String
    }

}
