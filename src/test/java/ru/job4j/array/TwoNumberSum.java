package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        Arrays.sort(array);
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                return new int[] {i, j};
            } else if (array[i] + array[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[] {};
    }
}