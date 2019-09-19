package ru.sberbank;

import java.io.*;
import java.util.Scanner;

public class Input {
    String fileName;

    public static void typeOfInput(String fileName) throws IOException {
        if (fileName.equals("0")) {
            InputStreamReader streamReader = new InputStreamReader(System.in);
            BufferedReader stream = new BufferedReader(streamReader);
            Analyzer.analysis(stream);
        } else {
            FileReader streamReader = new FileReader(fileName);
            BufferedReader stream = new BufferedReader(streamReader);
            Analyzer.analysis(stream);
        }

    }
}
