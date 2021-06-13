package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.impl.SearchImpl;
import org.junit.Assert;
import org.junit.Test;

public class SearchImplTest {
    public static final int[] ARRAY_OF_INT = {0, 5, 4, 8, -1, -3, 14, -12, -6};
    SearchImpl searchImpl = new SearchImpl();

    @Test
    public void testFindMaximum() {
        int expected = 14;
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(expected, searchImpl.findMaximum(simpleArray));
    }

    @Test
    public void testFindMinimum() {
        int expected = -12;
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(expected, searchImpl.findMinimum(simpleArray));

    }

    @Test
    public void testFindPositive() {
        int expected = 4;
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(expected, searchImpl.findPositive(simpleArray));

    }

    @Test
    public void testFindNegative() {
        int expected = 4;
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(expected, searchImpl.findNegative(simpleArray));
    }

}
