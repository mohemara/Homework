package com.desafio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double consume;
        String name;

        Scanner input= new Scanner(System.in);
        System.out.println("Welcome Water Bill Calculation System");
        System.out.println("please inform your name");
        name = input.nextLine();
        System.out.println("  ");
        System.out.println("welcome "+ name);
        System.out.println("  ");
        System.out.println("Please inform the water consume ");
        consume = Double.parseDouble(input.nextLine()) ;
        System.out.println("  ");
        System.out.println(" your water consume "+ consume);
        System.out.println("  ");
        if (consume<=10)
            System.out.println("your cost = 26.18");
        else if (consume>= 11 & consume<=20)
            System.out.println("your cost = 4.10");
        else if (consume>= 21 & consume<=50)
            System.out.println("your cost =10.23");
        else if (consume>50)
            System.out.println("your cost =11.27");
        else
            System.out.println("please provide the right water consume");


    }
}


