package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.numberMethod();
        main.faceControlMethod();
        main.arrayMethod();
    }

    public void numberMethod() {
        System.out.print("Please enter number: ");
        Scanner scr = new Scanner(in);
        try {
            System.out.println(scr.nextInt() > 7 ? "Hello" : "Bye");
        } catch (InputMismatchException y) {
            System.out.println("You entered not a number, please try again!!!!");
            numberMethod();
        }

    }

    public void faceControlMethod() {
        System.out.print("Please enter name: ");
        Scanner scr = new Scanner(in);
        System.out.println(scr.nextLine().equalsIgnoreCase("Vyacheslav")? "Hello, Vyacheslav": "There is no such name");
    }

    public void arrayMethod() {
        System.out.print("Please fill array: ");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            writeInArray(arr, i);
        }
        System.out.println(Arrays.toString(Arrays.stream(arr).filter(x -> (x % 3 == 0)).toArray()));

    }

    public void writeInArray(int[] arr, int index) {
        Scanner scr = new Scanner(System.in);
        try {
            arr[index] = scr.nextInt();
        } catch (InputMismatchException r) {
            System.out.println("Try again");
            writeInArray(arr, index);
        }
    }

}

