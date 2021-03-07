package com.desafio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1= "Student has been approved";
        String s2= "Student has failed";
        String s3= "Student is in recuperation";


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Students Notes Calculation");
        System.out.println("please inform your name");
        input.nextLine();
        System.out.println(" ");
        System.out.println("please inform your grade");
        double number = Double.parseDouble(input.nextLine());


        if(number<= 4)
            System.out.println(s2);

        else if(number>= 6)
            System.out.println(s1);

        else
            System.out.println(s3);


    }


}
