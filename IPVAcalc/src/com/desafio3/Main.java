package com.desafio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double cost;
        String name;
        int type;
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome IPVA Calculation System");
        System.out.println("please inform your name");
        name = input.nextLine();
        System.out.println("  ");
        System.out.println("welcome "+ name);
        System.out.println("  ");
        System.out.println("Please inform the cost of your car");
        cost= Double.parseDouble(input.nextLine()) ;
        System.out.println("  ");
        System.out.println(" your car costs "+ cost);
        System.out.println("  ");


        System.out.println("para calcular o IPVA escolha a categoria do veiculo entre 1,2,3,4  ");
        System.out.println(" 1-para Veiculos de carga, tipo caminhao degite ");
        System.out.println(" 2-onibus e micro-onibus, Caminhonetes, Motocicletas, M�quinas de terraplanagem degite 2 ");
        System.out.println(" 3-Veiculos movidos a alcool, gas natural, veicular (GNV)degite 3 ");
        System.out.println(" 4-outros degite 4");
        System.out.println("  ");
        type= Integer.parseInt(input.nextLine());
        System.out.println(" your car type is "+ type);
        System.out.println("  ");

        if(type==1) {
            System.out.println("IPVA = " + cost * 0.015);
            System.out.println("thank you");
        }
        else if (type==2) {
            System.out.println("IPVA = " + cost * 0.02);
            System.out.println("thank you");
        }
        else if (type==3) {
            System.out.println("IPVA = " + cost * 0.03);
            System.out.println("thank you");
        }
        else if (type==4) {
            System.out.println("IPVA = " + cost * 0.04);
            System.out.println("thank you");
        }
        else
            System.out.println("please provide the right type by providing a number from 1 to 4");

    }

}

