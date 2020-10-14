package com.epam.automation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Приветствовать любого пользователя при вводе его имени через командную строку.
        Scanner scanner = new Scanner(System.in);
	        String name = scanner.next();
	        System.out.println("Hello " + name);

    }
}
