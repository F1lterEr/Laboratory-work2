package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //Ввод
        System.out.println("Введите натуральное число X: ");
        int x = scanner.nextInt(); //Вводимая переменная x
        System.out.println("Введите количество повторов: ");
        int y = scanner.nextInt(); //Кол-во шагов
        y+=2;
        double n = 0; //Перменная для x**2/2!, -x**3/3! и т.д.
        int result = 1;

        for (int i = 2; i < y; i++) {
            for (int j = 1; j <= i; j++) {
                result = result * j;
            } //Вычисление факториала
            if (i % 2 == 0) //проверка знака
            {
                n = n + (Math.pow(x, i)) / result;
                result = 1;
            } //Вычисление x**2/2!, x**4/4! и т.д.
            else
            {
                n = n + (Math.pow(x, i)) / -result;
                result = 1;
            } //Вычисление -x**3/3!, -x**5/5! и т.д.
        }
        System.out.println("Число будет равно: " + (1 - x + n)); //Ответ
    }
}