package com.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please insert the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The largest element in the array is: " + maxArray(arr));
        System.out.println("The average of the elements of the array is: " + averageArray(arr));

        System.out.print("Please insert the number you want to search in the array: ");
        int nr = sc.nextInt();
        System.out.println("The number " + nr + " appears " + numberOfOccurrences(arr, nr) + " times" );
        System.out.print("The array " + (isSortedAscending(arr) ? "is" : "is NOT") + " sorted ascending!");

        System.out.print("Please insert the length of the second array: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("The merged array is: " + Arrays.toString(mergedArray(arr, arr1)));

        System.out.print("The index of the first occurrence of " + nr + " is: " + firstOccurrence(arr, nr));

        System.out.print("Please insert the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Please insert the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("The greatest common divisor of "+ firstNumber + " and " + secondNumber +" is: " + greatestCommonDivisor(firstNumber, secondNumber));
        System.out.println("The least common multiple of "+ firstNumber + " and " + secondNumber +" is: " + leastCommonMultiple(firstNumber, secondNumber));

        System.out.print("The array with elements bigger than " + nr + " is: " + Arrays.toString(elementsGreaterThanNumber(arr, nr)));

        System.out.println("The array with prime numbers is: " + Arrays.toString(primeNumbersInArray(arr)));
    }

    //max of the elements in an array
    private static int maxArray(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
//          max = Math.max(arr[i], arr[i + 1]);
        }

        return max;
    }

    //average of the elements in an array
    private static float averageArray(int[] arr) {
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }

        return (float) sum / arr.length;
    }

//    counts how many times a given number appears in an array.
    private static int numberOfOccurrences(int[] arr, int n) {
        int count = 0;

        for (int j : arr) {
            if (j == n) {
                count++;
            }
        }

        return count;
    }

//    checks if an array is sorted in ascending order.
    private static boolean isSortedAscending(int[] arr) {
        boolean sortedAscending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sortedAscending = false;
                break;
            }
        }

        return sortedAscending;
    }

//    merges two arrays and returns a new array with the result.
    private static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length + arr2.length; i++) {
            mergedArray[i] = i < arr1.length ? arr1[i] : arr2[i- arr1.length];
        }

        return mergedArray;
    }

//    returns the index of the first occurrence of a given number in an array (or -1 if not found).
    private static int firstOccurrence(int[] arr, int n) {

        int firstOccurence = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                firstOccurence = i;
            }
        }

        return firstOccurence;
    }

//    finds the greatest common divisor (GCD) of two integers.
    private static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

//    finds the least common multiple (LCM) of two integers.
    private static int leastCommonMultiple(int a, int b) {

        return Math.abs(a * b) / greatestCommonDivisor(a, b);

    }

//    receives an array and a number, and returns a new array with all elements greater than that number.
    private static int[] elementsGreaterThanNumber(int[] arr, int n) {

        int count = 0;
        for (int num : arr) {
            if (num > n) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;


        for (int num : arr) {
            if (num > n) {
                result[index++] = num;
            }
        }

        return result;
    }

    //returns true if a number is prime
    private static boolean isPrime(int n) {

        if (n <= 1) return false; // 0, 1, negatives are not prime
        if (n == 2) return true;  // 2 is prime
        if (n % 2 == 0) return false; // even numbers > 2 are not prime

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

//    returns an array with prime numbers
    private static int[] primeNumbersInArray(int[] arr) {
        int count = 0;

        for (int el: arr) {
            if (isPrime(el)) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int el: arr) {
            if (isPrime(el)) {
                result[index++] = el;
            }
        }

        return result;
    }

}
