package com.epam.task2.variant.sixth.logic;

import org.junit.Test;

public class DateCompleteTaskTest {
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void dateCompleteTaskTestWhenOneParameter() {
    String developerAndHours = "ControlName";
    DateCompleteTask dateCompleteTask = new DateCompleteTask();
    String result = dateCompleteTask.calculateDateCompleteTask(developerAndHours);
    }

    @Test(expected = NumberFormatException.class)
    public void dateCompleteTaskTestWhenParametersChangePlaces() {
        String developerAndHours = "55 ControlName";
        DateCompleteTask dateCompleteTask = new DateCompleteTask();
        String result = dateCompleteTask.calculateDateCompleteTask(developerAndHours);
    }

    @Test(expected = NullPointerException.class)
    public void dateCompleteTaskTestWhenNoParameters() {
        String developerAndHours = null;
        DateCompleteTask dateCompleteTask = new DateCompleteTask();
        String result = dateCompleteTask.calculateDateCompleteTask(developerAndHours);
    }
}
