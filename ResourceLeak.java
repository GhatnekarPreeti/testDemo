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
	String count;
    public void process() {
        SecureRandom secureRandom = new SecureRandom();
        try {
            PrintWriter out = new PrintWriter("");
            out.println("the text");
            out.close();
            Cipher c1 = Cipher.getInstance("DES");
        } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            System.err.println();

       

        }

    }
    public void process2() {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("out.txt", true)));
            out.println("the text");
        } catch (IOException e) {
            logger.error("Resource is not closed anywhere.",e);
        }
    }


	  public void demo(String name, String surName,String count) {
		String surName = surName;
		name = name;
		  this.count = count;
	   }
public void method() {
		Thread myThread = new Thread();
		// EMB-ISSUE: CodeIssueNames.RUN_SHOULD_NOT_BE_CALLED_DIRECTLY
		myThread.run();
	}

}
