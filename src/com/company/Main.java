package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int sumInit = 250;
        int bonus = 0;
        int sumAddition = 1000;


        bonus = sumAddition >= 1001 ? sumAddition / 100 : 0;
        sumInit = sumInit + sumAddition + bonus;

        System.out.println("Начальная сумма пополнения = " + sumAddition + "Бонус за рубли: " + bonus + "Итоговая сумма: " + sumInit);

    }
}
