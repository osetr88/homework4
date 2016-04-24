package com.sautin.main;

import com.sautin.face.IInvertInterface;
import com.sautin.inversion.Inversion;

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

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C", "D", "E"};

        IInvertInterface inversion = new Inversion();

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
