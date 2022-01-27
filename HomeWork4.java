package ru.gb.lesson4;

import java.util.Random;
import java.util.Scanner;
class HomeWork4 {
    final char CHAR_O = 'o';
    final char CHAR_X = 'x';
    final char CHAR_T = '-';
    final int SIZE = 4;
    Random random;
    Scanner scanner;
    char [][] table;

    public static void main(String[] args){
        new HomeWork4().game();
    }
    HomeWork4(){
        table = new char[SIZE][SIZE];
        random = new Random();
        scanner = new Scanner(System.in);
    }
    void game(){
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (checkWin(CHAR_X)) {
                System.out.println("You Won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw....");
                break;
            }
            turnAi();
            printTable();
            if (checkWin(CHAR_O)) {
                System.out.println("You Lost!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, Draw....");
                break;
            }
        }
        printTable();
        System.out.println("Game Over!!!");
    }
    void initTable(){
        for (int x=0; x<SIZE; x++){
            for (int y=0; y<SIZE; y++){
                table[x][y]=CHAR_T;
            }
        }
    }
    void printTable(){
        for (int x=0; x<SIZE; x++){
            for (int y=0; y<SIZE; y++){
                System.out.print(table[y][x] + " ");
            }
        System.out.println();
        }
    }
    void turnHuman(){
        int x,y;
        do {
            System.out.println("Enter x, y from 0 do " + SIZE + ":");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x,y));
        table[x][y] = CHAR_X;
    }
    void turnAi(){
        int x,y ;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x,y));
        table[x][y] = CHAR_O;
    }
    boolean isCellValid(int x, int y){
        if( x<0 || y<0 || x>SIZE || y>SIZE){
            return false;
        }
        return table[x][y] == CHAR_T;
    }
    boolean checkWin(char ch){
        for (int a=0; a<SIZE; a++) {
            if ((table[a][0] == ch && table[a][1] == ch && table[a][2] == ch) ||
            (table[0][a] == ch && table[1][a] == ch && table[2][a] == ch)) {
                return true;
            }
        }
        if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
           (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) {
            return  true;
        }
        return false;
    }
    boolean isTableFull(){
        for (int x=0; x<SIZE; x++){
            for (int y=0; y<SIZE; y++){
                if (table[x][y] == CHAR_T){
                    return false;
                }
            }
        }
        return true;
    }

}
