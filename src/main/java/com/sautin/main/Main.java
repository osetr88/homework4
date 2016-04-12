package com.sautin.main;

import com.sautin.inversion.Inversion;

import java.util.ArrayList;

/**
 * Main class
 * Entry point of program
 */
public class Main {
    /**
     * main method
     * @param args incoming arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            intArray.add(i + 1);
        }

        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("A");
        stringArray.add("B");
        stringArray.add("C");
        stringArray.add("D");
        stringArray.add("E");

        Inversion inversion = new Inversion();
        try {
            System.out.println("Int Array: ");
            for (int i : intArray) {
                System.out.print(i + " ");
            }
            System.out.println();
            inversion.invert(intArray);
            System.out.println("Inverted Int Array: ");
            for (int i : intArray) {
                System.out.print(i + " ");
            }
        } catch (NullPointerException e) {
            System.out.println("Your array is empty!");
        }

        System.out.println();

        try {
            System.out.println("String Array: ");
            for (String i : stringArray) {
                System.out.print(i + " ");
            }
            System.out.println();
            inversion.invert(stringArray);
            System.out.println("Inverted String Array: ");
            for (String i : stringArray) {
                System.out.print(i + " ");
            }
        } catch (NullPointerException e) {
            System.out.println("Your array is empty!");
        }
    }
}
