package com.giovannyenes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int Value1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int Value2 = sc.nextInt();

        Contador contador = new Contador();
        contador.parametersValiation(Value1,Value2);

    }
}