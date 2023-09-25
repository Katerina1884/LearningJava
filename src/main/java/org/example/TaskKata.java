package org.example;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TaskKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату начала последней менструации (гггг-мм-дд):");
        LocalDate lastDate = LocalDate.parse(scanner.nextLine());
        System.out.println("Введите длину цикла:");
        int cycle = scanner.nextInt();
        LocalDate todayDate = LocalDate.now();
        boolean b = periodIsLate(lastDate, todayDate, cycle);
        System.out.println(b);
    }

    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        long daysBetween = ChronoUnit.DAYS.between(last, today);
        return daysBetween > cycleLength;
    }

}




//    Наша функция будет принимать три параметра:
//
//        last - объект Date с датой последней менструации
//
//        today - объект Date с датой проверки
//
//        cycleLength - целое число, представляющее продолжительность цикла в днях
//
//        Верните значение true, если количество дней, прошедших с прошлого по сегодняшний день, больше продолжительности цикла. В противном случае верните значение false.
