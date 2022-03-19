package com.company;
import java.io.*;
import java.util.*;
class subtitutionCipher {
    public static final String str="abcdefghijklmnopqrstuvwxyz";
    public static final String strP="ABCDEFGHIKLMNOPQRSTUVWXYZ";

    public static String encrypt(String plaint,int key) {
        plaint=plaint.toLowerCase();
        String ciphert="";
        for(int i=0;i<plaint.length();i++)
        {
            int charpos=str.indexOf(plaint.charAt(i));
            int keyval=(charpos+key)%26;
            char replaceval=str.charAt(keyval);
            ciphert=ciphert+replaceval;
        }
        return ciphert;
    }


    public static String decrypt(String ciphert,int key) {
        ciphert=ciphert.toLowerCase();
        String plaint="";
        for(int i=0;i<ciphert.length();i++)
        {
            int charpos=str.indexOf(ciphert.charAt(i));
            int keyval=(charpos-key)%26;
            if(keyval<0)
            {
                keyval=str.length()+keyval;
            }
            char replaceval=str.charAt(keyval);
            plaint=plaint+replaceval;
        }
        return plaint;
    }

}


