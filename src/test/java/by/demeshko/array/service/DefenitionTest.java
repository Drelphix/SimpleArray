package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import org.junit.Assert;
import org.junit.Test;

public class DefenitionTest {
    Defenition defenition = new Defenition();
    int[] ARRAY_OF_INT = {0, 5, 4, 8, -1, -3, 14, -12, -6};

    @Test
    public void testFindAverage(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(1.0, defenition.findAverage(simpleArray),0.001);
    }

    @Test
    public void testFindSum(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        Assert.assertEquals(9, defenition.findSum(simpleArray));
    }

}
