package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.sorts.Sorts;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortsTest {
    int[] ARRAY_OF_INT = {0, 5, 4, 8, -1, -3, 14, -12, -6};
    Sorts sorts = new Sorts();

    @Test
    public void testSortBubbleSort(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] testArray = sortTestArray(simpleArray);
        sorts.sortBubbleSort(simpleArray);
        Assert.assertArrayEquals(testArray, simpleArray.getArray());
    }

    @Test
    public void testSortQuickSort(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] testArray = sortTestArray(simpleArray);
        sorts.sortQuickSort(simpleArray,0,ARRAY_OF_INT.length - 1);
        Assert.assertArrayEquals(testArray,simpleArray.getArray());
    }

    @Test
    public void testSortMergeSort(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] testArray = sortTestArray(simpleArray);
        sorts.sortMergeSort(simpleArray);
        Assert.assertArrayEquals(testArray, simpleArray.getArray());
    }

    private int[] sortTestArray(SimpleArray simpleArray){
        int[] testArray = Arrays.copyOf(ARRAY_OF_INT, ARRAY_OF_INT.length);
        Arrays.sort(testArray);
        return testArray;
    }
}
