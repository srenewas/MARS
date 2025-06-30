package com.seenu.naya;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("abc.txt");
            List<String> lines = Files.readAllLines(filePath);
            List<String> list =new ArrayList<>();
            for (String line : lines) {
                if (!line.isEmpty()) {
                    String ss = line+" Seenu_Iglesias";  //Adding the text and append to input file
                    list.add(ss);
                    System.out.println(ss.toUpperCase());
                }else {
                    System.out.println("File not found");
                }
            }
        }
   }

