package ru.gb.lesson5;
/* * Java. Level 1. Lesson 5.
 * @author Sergey Kostsyk
 * @version dated 29 jan, 2022
 */

class HomeWork5 {
    public static void main(String[] args){
        Sotrudnik []sotArr= new Sotrudnik[5];
        sotArr[0]= new Sotrudnik("Sergey Kostsyk","Bezdelnik", "asdasd@mail.ru", 8025155, 55555555, 32);
        sotArr[1]= new Sotrudnik("Adam Totol", "Bezdelnik", "asdaxzc@mail.ru", 8888888, 1515151, 20);
        sotArr[2]= new Sotrudnik("Anton Ivanov", "Shef", "dynnxzo@gmail.com", 1321455,1231236888,45);
        sotArr[3]= new Sotrudnik("Xoxol Kit", "Zam. dir", "daadaad@mail.ru", 111111, 313887741, 41);
        sotArr[4]= new Sotrudnik("Fatima Gulnar", "Buhgalter", "nimfa@yandex.net", 256489, 491323311,39);
        for (Sotrudnik sotrudnik :sotArr){
            if (sotrudnik.getAge()>=40){
                System.out.println(sotrudnik);
            }
        }
    }
}
class Sotrudnik {
    private String fio;
    private String position;
    private String email;
    private int phone;
    private int mani;
    private int age;

    Sotrudnik(String fio, String position, String email, int phone, int mani, int age){
        this.fio=fio;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.mani=mani;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "ФИО: " + fio + "   "+ "Должность: " + position +"   "+ "Email: " + email +"   "+ "Номер телефона: " + phone + "   "+"Зарплата: " + mani + "р. " +"Возраст: " + age;
    }
}

