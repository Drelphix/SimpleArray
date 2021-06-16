package by.demeshko.array.service;

import by.demeshko.array.creator.SimpleArrayCreator;
import by.demeshko.array.creator.impl.SimpleArrayCreatorImpl;
import by.demeshko.array.entity.SimpleArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SimpleArrayCreatorTest {

    @Test
    public void createSimpleArray() {
        List<int[]> actualParam = Arrays.asList(new int[]{10, 15, 8, 0, -5}, new int[]{14, 0, -5, 18, -100}, new int[]{1, 15, 17, 9, -5});
        SimpleArrayCreator simpleArrayCreator = new SimpleArrayCreatorImpl();
        SimpleArray simpleArray = simpleArrayCreator.createSimpleArray(actualParam);
        int[] expected = {10, 15, 8, 0, -5, 14, 0, -5, 18, -100, 1, 15, 17, 9, -5};
        Assert.assertArrayEquals(expected, simpleArray.getArray());
    }
}
