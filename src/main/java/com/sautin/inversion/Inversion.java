package com.sautin.inversion;

import com.sautin.face.IInvertInterface;

/**
 * Inversion Class
 * Provides invert for array of any types
 */
public class Inversion implements IInvertInterface {
    /**
     * Invert array of any types
     * @param <T> type of array elements
     * @param array array of some type
     */
    public <T> void invert(T[] array) {
        T temp;
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int index = size - i - 1;
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
