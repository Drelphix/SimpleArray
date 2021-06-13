package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.reader.SimpleArrayReaderImpl;
import org.junit.Assert;
import org.junit.Test;

public class SimpleArrayReaderImplTest {

    @Test
    public void readFile(){
        int[] expected = new int[]{10, 15, 8, 0, -5, 14, 0, -5, 18, 100, 1, 15, 17, 9, -5, };
        SimpleArrayReaderImpl simpleArrayReader = new SimpleArrayReaderImpl();
        Assert.assertArrayEquals(expected, simpleArrayReader.readFile().getArray());

    }
}
