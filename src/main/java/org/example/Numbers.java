package org.example;

import java.util.Scanner;

public class Numbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите 3 числа");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();

            if(number1 == number2 || number1 == number3) {
                System.out.println("yes");
            }
            else if(number2 == number3) {
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }
}
