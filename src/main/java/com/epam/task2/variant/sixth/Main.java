package com.epam.task2.variant.sixth;

import com.epam.task2.variant.sixth.data.DataAcquirer;
import com.epam.task2.variant.sixth.data.DataFactory;
import com.epam.task2.variant.sixth.data.enums.DataType;
import com.epam.task2.variant.sixth.logic.DateCompleteTask;
import com.epam.task2.variant.sixth.view.PrintFactory;
import com.epam.task2.variant.sixth.view.ResultPrinter;
import com.epam.task2.variant.sixth.view.enums.PrintType;

/**
 * Variant 6
 * An application that displays the name of the developer and how many days it takes to complete the task.
 * It is necessary to calculate the date and time of the assignment.
 * To get the date and time use the Calendar class from the java.util package.
 * The task starts the next day at 12.00.
 * @author Raman Aleksandrov
 */

public class Main {
    public static void main(String[] args) {
        DataFactory factory = new DataFactory();
        runFromConsole(factory);
        runFromFile(factory);

    }

   private static void runFromConsole(DataFactory dataFactory) {
        DataAcquirer console = dataFactory.getDataAcquirer(DataType.CONSOLE);
        String result = findTheResult(console);
        print(PrintType.CONSOLEPRINTER, result);
    }

    private static void runFromFile(DataFactory dataFactory) {
        DataAcquirer file = dataFactory.getDataAcquirer(DataType.FILE);
        String result = findTheResult(file);
        print(PrintType.FILEPRINTER, result);
    }

    private static String findTheResult(DataAcquirer dataAcquirer) {
        String developerAndHours = dataAcquirer.getDeveloperAndHours();
        DateCompleteTask dateCompleteTask = new DateCompleteTask();
        String result = dateCompleteTask.calculateDateCompleteTask(developerAndHours);
        return result;
    }

    private static void print(PrintType type, String result) {
        PrintFactory printFactory = new PrintFactory();
        ResultPrinter resultPrinter = printFactory.getResultPrinter(type);
        resultPrinter.print(result);
    }
}
