package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.sorts.Sort;
import by.demeshko.array.sorts.impl.SortImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortTest {
    public static final int[] ARRAY_OF_INT = {0, 5, 4, 8, -1, -3, 14, -12, -6};
    Sort sort = new SortImpl();

    @Test
    public void testSortBubbleSort() {
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] expected = sortTestArray();
        sort.sortBubbleSort(simpleArray);
        Assert.assertArrayEquals(expected, simpleArray.getArray());
    }

    @Test
    public void testSortQuickSort() {
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] expected = sortTestArray();
        sort.sortQuickSort(simpleArray, 0, ARRAY_OF_INT.length - 1);
        Assert.assertArrayEquals(expected, simpleArray.getArray());
    }

    @Test
    public void testSortMergeSort() {
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] expected = sortTestArray();
        sort.sortMergeSort(simpleArray.getArray(), simpleArray.getLength());
        Assert.assertArrayEquals(expected, simpleArray.getArray());
    }

    private int[] sortTestArray() {
        int[] testArray = Arrays.copyOf(ARRAY_OF_INT, ARRAY_OF_INT.length);
        Arrays.sort(testArray);
        return testArray;
    }
}
