package com.desafio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Gas Calculation Engine");
        System.out.println(" ");

        System.out.println("please inform the average consume of the car km/l");
        double p1= Double.parseDouble(input.nextLine());
        System.out.println(" ");
        System.out.println(p1 +" Km/l");

        System.out.println("please inform the distance by km" );
        double p2= Double.parseDouble(input.nextLine());
        System.out.println(" ");
        System.out.println(p2 +" Km");

        System.out.println("please inform the time of your trips");
        double p3= Double.parseDouble(input.nextLine());
        System.out.println(" ");
        System.out.println(p3 +" hours");

        System.out.println("gas consumption " + p1/p2 + " L" );
        System.out.println("Trip Averages " + p2/p3 + " Km/h");

        System.out.println(" ");
        System.out.println("Thank you");
    }


}
