package by.demeshko.array.service;

import by.demeshko.array.parser.ArrayParser;
import by.demeshko.array.parser.impl.ArrayParserImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class ArrayParserTest {

    @Test
    public void parseStringsToArray() {
        List<int[]> expected = Arrays.asList(new int[]{10, 15, 8, 0, -5}, new int[]{14, 0, -5, 18, -100}, new int[]{1, 15, 17, 9, -5});
        ArrayParser arrayParser = new ArrayParserImpl();
        List<int[]> actual = arrayParser.parseStringToArray(SimpleArrayReaderTest.expected);
        for (int i = 0; i < actual.size(); i++) {
            Assert.assertThat(expected.get(i), is(actual.get(i)));
        }
    }

    @Test
    public void parseStringsToArrayStreamTest() {
        int[] expected = new int[]{10, 15, 8, 0, -5, 14, 0, -5, 18, -100, 1, 15, 17, 9, -5};
        List<String> lines = Arrays.asList("10, 15, 8, 0, -5", "14, 0, -5, 18, -100", "1, 15, 17, 9, -5");
        ArrayParser arrayParser = new ArrayParserImpl();
        int[] actual = arrayParser.parseStringToArrayStream(lines);
        Assert.assertThat(expected, is(actual));
    }
}
