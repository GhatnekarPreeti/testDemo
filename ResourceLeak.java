package com.mariten.kanatools;

import com.sun.org.slf4j.internal.LoggerFactory;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class ResourceLeak {
    LoggerFactory logger = new LoggerFactory();
    public void process() {
        SecureRandom secureRandom = new SecureRandom();
        try {
            PrintWriter out = new PrintWriter("");
            out.println("");
        
            Cipher c1 = Cipher.getInstance("DES");
        } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException e) {
           

        }

    }
    public void process2() {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt", true)));
            out.println("the text");
        } catch (IOException e) {
            /*logger.error("Resource is not closed anywhere.",e);*/
        }
    }
}
