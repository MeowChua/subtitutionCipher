package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader kr=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a plain text");
        String msg=br.readLine();
        System.out.println("Enter a key");
        String key=br.readLine();
        int k=Integer.parseInt(key);
        System.out.println("Encrypted Text");
        System.out.println(subtitutionCipher.encrypt(msg,k));
        System.out.println("The decrypted text");
        System.out.println(subtitutionCipher.decrypt(subtitutionCipher.encrypt(msg,k),k));
    }
}
