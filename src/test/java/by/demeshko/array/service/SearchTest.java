package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest {
    int[] ARRAY_OF_INT = {0, 5, 4, 8, -1, -3, 14, -12, -6};
    Search search = new Search();
    int MAXIMUM = 14;
    int MINUMUM = -12;
    int[] POSITIVE_AND_NEGATIVE = {4, 4};

    @Test
    public void testFindMaximum() {
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(MAXIMUM, search.findMaximum(simpleArray));
    }

    @Test
    public void testFindMinimum() {
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(MINUMUM, search.findMinimum(simpleArray));

    }

    @Test
    public void testfindPositiveAndNegative() {
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertArrayEquals(POSITIVE_AND_NEGATIVE, search.findPositiveAndNegative(simpleArray));
    }

}
