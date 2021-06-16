package by.demeshko.array.service;

import by.demeshko.array.parcer.ArrayParser;
import by.demeshko.array.parcer.impl.ArrayParserImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayParserTest {

    @Test
    public void parseStringsToArray() {
        List<int[]> expected = Arrays.asList(new int[]{10, 15, 8, 0, -5}, new int[]{14, 0, -5, 18, -100}, new int[]{1, 15, 17, 9, -5});
        ArrayParser arrayParser = new ArrayParserImpl();
        List<int[]> actual = arrayParser.parseStringToArray(SimpleArrayReaderTest.expected);
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}
