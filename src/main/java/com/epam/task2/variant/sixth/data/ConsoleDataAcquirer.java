package com.epam.task2.variant.sixth.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {
    public String getDeveloperAndHours() {
        String developer = null;
        String numberOfHours = null;
        String developerAndHours;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter name developer:");
            developer = reader.readLine();
            System.out.println("Enter number of hours to complete the task:");
            numberOfHours = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        developerAndHours = developer + " " + numberOfHours;
        return developerAndHours;
    }
}
