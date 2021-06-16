package by.demeshko.array.service;

import by.demeshko.array.reader.SimpleArrayReader;
import by.demeshko.array.reader.impl.SimpleArrayReaderImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class SimpleArrayReaderTest {
    static final List<String> expected = Arrays.asList("10, 15, 8, 0, -5",
            "14 - 0 - -5 - 18 -100",
            "1z2 15 16 19 41",
            "1; 15; 17; 9; -5");

    @Test
    public void readFileTest() {
        SimpleArrayReader arrayReader = new SimpleArrayReaderImpl();
        Assert.assertThat(expected, is(arrayReader.readFile()));
    }
}
