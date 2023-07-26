package org.example;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();

        if (month >= 1 && month < 3) {
            System.out.println("Сейчас зима");
        }
        else if (month >= 3 && month < 6) {
            System.out.println("Сейчас весна");
        }
        else if (month >= 6 && month < 9) {
            System.out.println("Сейчас лето");
        }
        else if (month >= 9 && month < 12) {
            System.out.println("Сейчас осень");
        }
        else if (month == 12) {
            System.out.println("Сейчас зима");
        }
        else {
            System.out.println("Неверный номер месяца");
        }
    }
}