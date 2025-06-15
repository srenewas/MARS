package com.seenu.naya;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderExample {
    public static void main(String[] args) {
        // Replace this with your external file path
        Path filePath = Path.of("abc.txt");

        try {
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                if (!line.isEmpty())
                    System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}

