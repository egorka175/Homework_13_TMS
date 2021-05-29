package com.tms.Homework_13_TMS.Homework_13_ex0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
public class Data {
    //Вычисляет день недели по дате.
    private static void weekOfDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date=simpleDateFormat.parse("29/03/2021");
        System.out.println("Дата: "+simpleDateFormat.format(date));
        simpleDateFormat.applyPattern("E");
        String result=simpleDateFormat.format(date);
        System.out.println("День недели этой даты: "+result);
    }
    //Вычисляет дату следующего вторника исходя из введенной даты.
    private static void nextTuesday() throws ParseException {
        LocalDate localDate=LocalDate.of(2021, 9, 23);
        System.out.println("Дата: "+localDate);
        TemporalAdjuster nextTuesday= TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println("Дата следующего  вторника: "+localDate.with(nextTuesday));
    }
    public static void main(String[] args) throws ParseException {
       weekOfDate();
       nextTuesday();
    }
}
