package com.ua.robot.homeWork23;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadAndWriteNIO {


    public void read() {
        try {
            Files.write(Path.of("text.txt"), List.of("Hello NIO :)"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void write() {
        try {
            Files.readAllLines(Path.of("text.txt")).forEach(System.out::println);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
