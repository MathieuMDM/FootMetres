package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value in feet:");

        double feet = scanner.nextDouble();

        double metres = feet * 0.305;

        System.out.println(feet + " this value in feet is equal to " + metres + " metres");

    }
}
