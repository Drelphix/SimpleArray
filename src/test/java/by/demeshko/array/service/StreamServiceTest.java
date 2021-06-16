package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.impl.StreamServiceImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StreamServiceTest {
    public static final int[] ACTUAL_ARRAY = {0, 5, 4, 8, -1, 0, 14, -12, -6};
    public static final int[] EXPECTED_ARRAY = {-5, 5, 4, 8, -1, -5, 14, -12, -6};
    StreamService streamService = new StreamServiceImpl();

    @Test
    public void replaceIfZeroStreamTest() {
        SimpleArray actual = new SimpleArray(ACTUAL_ARRAY);
        actual = streamService.replaceIfZeroStream(actual);
        Assert.assertArrayEquals(EXPECTED_ARRAY, actual.getArray());
    }

    @Test
    public void findStreamMinimumTest() {
        SimpleArray simpleArray = new SimpleArray(ACTUAL_ARRAY);
        int expected = -12;
        Assert.assertEquals(expected, streamService.findStreamMinimum(simpleArray));
    }

    @Test
    public void findStreamMaximumTest() {
        SimpleArray simpleArray = new SimpleArray(ACTUAL_ARRAY);
        int expected = 14;
        Assert.assertEquals(expected, streamService.findStreamMaximum(simpleArray));
    }

    @Test
    public void findStreamPositiveTest() {
        SimpleArray simpleArray = new SimpleArray(ACTUAL_ARRAY);
        int expected = 4;
        Assert.assertEquals(expected, streamService.findStreamPositive(simpleArray));
    }

    @Test
    public void findStreamNegativeTest() {
        SimpleArray simpleArray = new SimpleArray(ACTUAL_ARRAY);
        int expected = 3;
        Assert.assertEquals(expected, streamService.findStreamNegative(simpleArray));
    }

    @Test
    public void sortStreamTest() {
        SimpleArray simpleArray = new SimpleArray(ACTUAL_ARRAY);
        int[] expected = Arrays.copyOf(ACTUAL_ARRAY, ACTUAL_ARRAY.length);
        Arrays.sort(expected);
        Assert.assertArrayEquals(expected, streamService.sortStream(new SimpleArray(ACTUAL_ARRAY)).getArray());
    }

    @Test
    public void findAverageStreamTest() {
        SimpleArray simpleArray = new SimpleArray(ACTUAL_ARRAY);
        double expected = 1.333;
        Assert.assertEquals(expected, streamService.findAverageStream(simpleArray), 0.001);

    }

    @Test
    public void findSumStreamTest() {
        SimpleArray simpleArray = new SimpleArray(ACTUAL_ARRAY);
        int expected = 12;
        Assert.assertEquals(expected, streamService.findSumStream(simpleArray));
    }
}
