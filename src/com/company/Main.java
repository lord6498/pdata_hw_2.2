package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int SumInit = 250;
        int Bonus = 0;
        int SumAddition=1000;


        Bonus = SumAddition >= 1001? SumAddition/100 :0;
        SumInit = SumInit + SumAddition + Bonus;

        System.out.println("Начальная сумма пополнения = " + SumAddition + "Бонус за рубли: " + Bonus + "Итоговая сумма: " + SumInit);

    }
}
