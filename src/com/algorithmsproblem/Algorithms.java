package com.algorithmsproblem;

import java.util.Scanner;

/**
 * This class is for bubble short
 */
public class Algorithms {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of integers
        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        // Create an array to store the integers
        int[] numbers = new int[count];

        // Read the integers
        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Bubble sort algorithm
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap the numbers
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print the sorted numbers
        System.out.println("Sorted numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}

