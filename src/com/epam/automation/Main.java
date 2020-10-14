package com.epam.automation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        // Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scanner = new Scanner(System.in);
	        String name = scanner.next();
	        System.out.println("Hello " + name);
        */

        //--------------------------------------------------------
        /*
        Scanner scanner = new Scanner(System.in);
            System.out.print("ВВедите последовательность цифр: ");
            int value = scanner.nextInt();
            int mirror = 0;
            while (value != 0) {
                mirror = mirror * 10 + (value % 10);
                value = value / 10;
    }

            System.out.print("Введите обратную последовательность цифр: " + mirror);

         */
        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
            System.out.print(i);
        }
    }
    }
