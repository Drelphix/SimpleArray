package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.impl.DefinitionImpl;
import org.junit.Assert;
import org.junit.Test;

public class DefinitionImplTest {
    DefinitionImpl definitionImpl = new DefinitionImpl();
    int[] ARRAY_OF_INT = {0, 5, 4, 8, -1, -3, 14, -12, -6};

    @Test
    public void testFindAverage(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        double expected = 1.0;
        double actual = definitionImpl.findAverage(simpleArray);
        Assert.assertEquals(expected, actual,0.001);
    }

    @Test
    public void testFindSum(){
        SimpleArray simpleArray = new SimpleArray(ARRAY_OF_INT);
        int expected = 9;
        int actual = definitionImpl.findSum(simpleArray);
        Assert.assertEquals(expected, actual);
    }

}
