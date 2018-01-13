package com.dfmzone;


import java.util.Arrays;

public class CaesarCipher {

    protected char[] encoder;// encrypt
    protected char[] decoder; // decrypt
    private char first;

    public static void main(String[] args) {

//        CaesarCipher cipher = new CaesarCipher(4);
        CaesarCipher cipherRuus = new CaesarCipher(3, "Russ", 31);
        System.out.println(cipherRuus.encrypt("сказать"));

//        System.out.println(cipher.encrypt("MY NAME IS DIEGO"));
//        System.out.println(cipher.decrypt("QC REQI MW HMIKS"));
    }

    public CaesarCipher(int rotation) {
        encoder = new char[26];
        decoder = new char[26];
        for (int k = 0; k < 26; k++) {
            encoder[k] = (char) (first + (k + rotation) % 26); // Use mod to wrap at the end... when k = 25 > (25 + 3) % 26 = 2 = 'C'
            decoder[k] = (char) (first + (k - rotation + 26) % 26); // Here when k = 0 => (0 - 3 + 26) % 26 = 23 = 'X'
        }
    }

    // Constructor for other locations
    public CaesarCipher(int rotation, String alphabet, int size) {
        encoder = new char[size];
        decoder = new char[size];
        this.first = (char) firstLetter(alphabet);
        for (int k = 0; k < size; k++) {
            encoder[k] = (char) (first + (k + rotation) % size);
            decoder[k] = (char) (first + (k - rotation + size) % size);
        }
        System.out.println(Arrays.toString(encoder));
        System.out.println(Arrays.toString(decoder));
    }

    public String encrypt(String message) {
        return transform(message, this.encoder);
    }

    public String decrypt(String message) {
        return transform(message, this.decoder);
    }

    private String transform(String original, char[] code) {
        char[] msg = original.toCharArray(); // Transform the String to a char array
        for (int k = 0; k < msg.length; k++) {
            if (Character.isLowerCase(msg[k])) { // check if the char we're at is upper case
                int j = msg[k] - first; // assign j to msg[k] - 'A' so we can take the unicode point for the current letter
                msg[k] = code[j]; // take the current position and assign to the element of the same position in the encoder array code[]
            }
        }
        return new String(msg); // Transform the array msg[] to a String
    }

    private int firstLetter(String alphabet) {
        switch (alphabet) {
            case "Russ":
                return 1072;
        }
        return -1;
    }
}
