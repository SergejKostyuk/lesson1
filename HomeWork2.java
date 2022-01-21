package ru.gb.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(summ(16, 10));
        resultat(-10);
        System.out.println(znachenie(12));
        stringN("hello", 5);
        System.out.println(god(1561));
    }
    static boolean summ(int a, int b){
       int c = a+b;
       return (c>=10 && c<=20);
    }
   static void resultat(int a){
       System.out.println( a>0 ? "Число положительное": "Число отрицательное");

    }
    static boolean znachenie(int a){
        return a<0;
    }
    static void stringN(String text, int b ){
        int a;
        for (a=0 ;a<b; a++){
            System.out.println(text);
        }
    }
    static boolean god(int a) {
        return (a % 4 == 0 && a % 100 != 0) && a % 400 == 0;
    }

}

