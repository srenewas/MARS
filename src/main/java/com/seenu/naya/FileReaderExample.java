package com.seenu.naya;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        // Replace this with your external file path
        Path filePath = Path.of("abc.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                if (!line.isEmpty()) {
                    System.out.println(line.toLowerCase());
                }else {
                    System.out.println("File not found");
                }
            }
        }
   }

