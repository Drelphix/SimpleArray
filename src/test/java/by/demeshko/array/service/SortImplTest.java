package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.sorts.impl.SortImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortImplTest {
    public static final int[] ARRAY_OF_INT = {0, 5, 4, 8, -1, -3, 14, -12, -6};
    SortImpl sortImpl = new SortImpl();

    @Test
    public void testSortBubbleSort(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] expected = sortTestArray();
        sortImpl.sortBubbleSort(simpleArray);
        Assert.assertArrayEquals(expected, simpleArray.getArray());
    }

    @Test
    public void testSortQuickSort(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] expected = sortTestArray();
        sortImpl.sortQuickSort(simpleArray,0,ARRAY_OF_INT.length - 1);
        Assert.assertArrayEquals(expected,simpleArray.getArray());
    }

    @Test
    public void testSortMergeSort(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int[] expected = sortTestArray();
        sortImpl.sortMergeSort(simpleArray);
        Assert.assertArrayEquals(expected, simpleArray.getArray());
    }

    private int[] sortTestArray(){
        int[] testArray = Arrays.copyOf(ARRAY_OF_INT, ARRAY_OF_INT.length);
        Arrays.sort(testArray);
        return testArray;
    }
}
