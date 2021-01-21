package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum_init = 250;
        int bonus = 0;
        int sum_addition=1000;


        bonus = sum_addition >= 1001? sum_addition/100 :0; 
        sum_init = sum_init + sum_addition + bonus;

        System.out.println("Начальная сумма = " + sum_init + "Бонус за рубли: " + bonus + "Итоговая сумма: " + sum_init);

    }
}
