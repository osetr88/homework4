package com.sautin.face;

/**
 * Interface that provides invert of array
 */
public interface IInvertInterface {
    /**
     * invert array
     * @param <T> type of array
     * @param array array of any type
     * @return inverted array of any type
     */
    <T> T[] invert (T[] array);
}
