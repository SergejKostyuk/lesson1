package ru.gb.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(summ(16, 10));
        resultat(-10);
        System.out.println(znachenie(12));
        stringN("hello", 5);
        System.out.println(god());
    }
    static boolean summ(int a, int b){
       int c = a+b;
       return (c>=10 && c<=20);
    }
   static void resultat(int a){
        if (a>=0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    static boolean znachenie(int a){
        if (a<0){
            return true;
        } else {
            return false;
        }
    }
    static void stringN(String text, int a ){
        for ( ;a<10; a++){
            System.out.println(text);
        }
    }
    /*static boolean god(int a) {
        int x=(a=0;a<4; a++)&&(a=0; a=!100; a++) && (a=0;a<400; a++);
        if (a==x){
            return true;
        } else {
            return false;
        }
    }*/

}

