package com.desafio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Welcome IMC Calculation System");
        System.out.println("please inform your name");
        String name = input.nextLine();
        System.out.println("  ");
        System.out.println("welcome "+ name);
        System.out.println("  ");
        System.out.println("Please inform your weight in KG ");
        double weight = Double.parseDouble(input.nextLine()) ;
        System.out.println("  ");
        System.out.println(" your weight is "+ weight +" KG");
        System.out.println("  ");
        System.out.println("Please inform your height in CM ");
        double height= Double.parseDouble(input.nextLine());
        System.out.println(" your height is "+ height + " CM");

        double IMC= weight/(height*height);

        if (IMC<18.5)
            System.out.println("behind weight");

        else if (IMC>=18.5 && IMC<25.0)
            System.out.println(" good shape ");

        else if (IMC>=25.0 && IMC<30)
            System.out.println("above weight");

        else if (IMC>=30.0 && IMC<34.9)
            System.out.println(" obesity 1 ");

        else if(IMC>=35.0 && IMC<39.9)
            System.out.println(" obesity 2 ");

        else if(IMC>=40)
            System.out.println(" obesity 3 ");


    }

}
