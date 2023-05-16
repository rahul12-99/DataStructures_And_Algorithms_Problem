package com.algorithmsproblem;

public class Algorithms {
    /**
     * This method is for input for binary search
     */
    public static void binarySearch() {
        String[] array = {"we", "are", "the", "people", "of", "India"};
        stringBinary(array, "people");
    }

    /**
     * This method is for binary search searching with the key
     */

    public static void stringBinary(String[] array, String search) {
        int mid;
        int min = 0, max = array.length - 1;
        while (min <= max) {
            mid = (min + max) / 2;
            if (array[mid].compareTo(search) < 0) {
                min = mid + 1;
            } else if (array[mid].compareTo(search) > 0) {
                max = mid - 1;
            } else if (array[mid].compareTo(search) == 0) {
                System.out.println("Key found");
                return;
            }
        }
        System.out.println("key not found ");
    }

    /**
     * Main method for execute the program
     */
    public static void main(String[] args) {
        Algorithms.binarySearch();
    }
}
