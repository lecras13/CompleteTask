package com.epam.task2.variant.sixth.logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCompleteTask {
    public String calculateDateCompleteTask(String developerAndHours) {
        String toReturn = null;
        String[] developerAndHoursByParts = developerAndHours.split(" ");
        String developer = developerAndHoursByParts[0];
        int hours = Integer.parseInt(developerAndHoursByParts[1]);

        Calendar startDay = new GregorianCalendar();
        //get tomorrowDate
        startDay.set(Calendar.HOUR_OF_DAY, 12);
        startDay.set(Calendar.MINUTE, 00);
        startDay.set(Calendar.SECOND, 00);
        startDay.add(Calendar.DAY_OF_MONTH, +1);
        toReturn = developer + " is ready to complete the task from " + startDay.getTime();
        //get completeDate
        startDay.add(Calendar.HOUR, +hours);
        toReturn += " to " + startDay.getTime() + " in " + hours + " hours.";
        return toReturn;
    }
}
