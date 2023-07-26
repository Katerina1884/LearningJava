package org.example;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите возраст");
        int age = scanner.nextInt();

        if(age >= 18 && age< 28) {
            System.out.println("Вы подлежите призыву на срочную службу или можете служить по контракту.");
        }
        else if(age >= 28 && age < 60) {
            System.out.println("Вы можете служить по контракту.");
        }
        else if(age>0 && age < 18) {
            System.out.println("Вы находитесь в непризывном возрасте.");
        }
        else if(age > 59 && age < 100) {
            System.out.println("Вы находитесь в непризывном возрасте.");
        }
        else {
            System.out.println("Ошибка!");
        }
    }
}
