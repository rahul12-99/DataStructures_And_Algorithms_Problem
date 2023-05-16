package com.algorithmsproblem;

import java.util.Scanner;

/**
 * This class is for insertion short
 */
public class Algorithms {

    public static void insertionSort(String[] strings) {
        for (int i = 1; i < strings.length; i++) {
            String key = strings[i];
            int j = i - 1;
            while (j >= 0 && strings[j].compareTo(key) > 0) {
                strings[j + 1] = strings[j];
                j--;
            }
            strings[j + 1] = key;
        }
    }

    /**
     * Main method for execute the program taking user input short the string
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        insertionSort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

