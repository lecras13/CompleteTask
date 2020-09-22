package com.epam.task2.variant.sixth.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileResultPrint implements ResultPrinter {
    private String fileName;

    public FileResultPrint(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print(String result) {
        System.out.println("Open FileResultPrinter to know the result");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            String str = String.valueOf(result);
            writer.write(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
