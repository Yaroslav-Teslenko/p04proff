package l04.t3l4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class t3l4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input data ");
        try{
            //String tmp =("1990-11-25");
            String tmp =scanner.nextLine();
            LocalDateTime fromDateTime = LocalDateTime.of (LocalDate.parse(tmp, DateTimeFormatter.ofPattern("dd-MM-yyyy")), LocalTime.of(0,0,0));
            LocalDateTime toDateTime=LocalDateTime.now();
            Period period = Period.between(fromDateTime.toLocalDate(), toDateTime.toLocalDate());
            Duration duration = Duration.between(fromDateTime.toLocalTime(), toDateTime.toLocalTime());

            System.out.println(period.getYears() + " years " +
                    period.getMonths() + " months " +
                    period.getDays() + " days " +
                    duration.toHoursPart() + " hours " +
                    duration.toMinutesPart() + " minutes " +
                    duration.toSecondsPart() + " seconds.");

        } catch (Exception e){
            e.printStackTrace();
        }

    }

};
