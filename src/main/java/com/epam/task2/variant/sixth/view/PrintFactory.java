package com.epam.task2.variant.sixth.view;

import com.epam.task2.variant.sixth.view.enums.PrintType;

public class PrintFactory {
    private static final String FILEPATH = "E:\\CompleteTask\\src\\main\\resources\\FileResultPrinter.txt";

    public ResultPrinter getResultPrinter(PrintType type) {
        ResultPrinter toReturn = null;
        switch (type) {
            case CONSOLEPRINTER:
                toReturn = new ConsoleResultPrinter();
                break;
            case FILEPRINTER:
                toReturn = new FileResultPrint(FILEPATH);
                break;
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}


