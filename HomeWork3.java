
package ru.gb.lesson3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println();
        zad1();
        System.out.println();
        zad2();
        System.out.println();
        zad3();
        System.out.println();
        zad4();
        System.out.println();
        zad5_2(zad5_1(9,8));
    }
    static void zad1(){
        System.out.println("Задание 1");
        int [] arr = {0,1,1,1,0,0,0,1,1,0};
        int z =0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[z]=arr[i]=1;
                System.out.print(arr[z] + "  ");
            } else {
                arr[z]=arr[i]=0;
                System.out.print(arr[z] + "  ");
            }
        }
    }
    static void zad2(){
        System.out.println("Задание 2");
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i]=i;
            System.out.print(arr[i]);
        }
    }
    static void zad3(){
        System.out.println("Задание 3");
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int a=0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i]<=6) {
                arr[a]= arr[i]*2;
                System.out.print(arr[a] + "  ");
            } else {
                arr[a]=arr[i];
                System.out.print(arr[a] + "  ");
            }
        }

    }
    static void zad4(){
       System.out.println("Задание 4");
       int counter=1;
       int [][] table = new int[5][5];
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                table[i][j]=counter;
                if (table[i]==table[j] || i+j==4){
                    table[i][j]=0;
                    System.out.print(table[i][j] + "  ");
                }else {
                    table[i][j]=table[i][j];
                    System.out.print(table[i][j] + "  ");
                }
            }
            System.out.println();
            }
    }
    static int [] zad5_1(int len, int initialValue){
        System.out.println("Задание 5");
        int [] arr= new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    static void zad5_2(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}


