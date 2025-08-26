package com.giovannyenes;

import java.util.Scanner;
import com.giovannyenes.ParametrosInvalidosException;

public class Contador {
    int value1;
    int value2; 

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public String parametersValiation(int value1, int value2){
        try {

            if (value1 > value2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

            } else {
                int sum = value2 - value1;

                for (int i = 1; i <= sum; i++) {
                    System.out.println("Imprimindo o número " + i );
                }
            }


        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());

            Scanner sc = new Scanner(System.in);
            setValue1(value1 = sc.nextInt());
            setValue2(value2 = sc.nextInt());

            return parametersValiation(value1, value2);
            }
        return null;
        }
    }
