package com.ua.robot.homeWork22;

import java.io.*;

public class ReadWriteText {
    final static String TEXT = "text.txt";

    public void read() {
        try (FileWriter out = new FileWriter(TEXT); BufferedWriter bf = new BufferedWriter(out);
             PrintWriter printWriter = new PrintWriter(bf)) {
            printWriter.println("I'm learning Java :)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void write() {
        try (BufferedReader in = new BufferedReader(new FileReader(TEXT))) {
            System.out.println(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
