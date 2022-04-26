package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter percentage : ");
        double percentage = input.nextDouble();

        if (percentage <= 50) {
            System.out.println("Fail....");
        }
        else if (percentage > 50 && percentage <= 60) {
            System.out.println("D Grade");
        }
        else if (percentage > 60 && percentage <= 70) {
            System.out.println("C Grade");
        }
        else if (percentage > 70 && percentage <= 80) {
            System.out.println("B Grade");
        }
        else if (percentage > 80 && percentage <= 90) {
            System.out.println("A Grade");
        }
        else if (percentage > 90 && percentage <= 100) {
            System.out.println("A+ Grade");
        }
        else {
            System.out.println("Invalid Percentage....");
        }
    }
}
