package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.impl.StreamServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class StreamServiceImplTest {
    StreamService streamService = new StreamServiceImpl();
    public static final int[] ARRAY_WITH_ZERO = {0, 5, 4, 8, -1, 0, 14, -12, -6};
    public static final int[] EXPECTED_ARRAY = {-5, 5, 4, 8, -1, -5, 14, -12, -6};

    @Test
    public void replaceIfZeroStreamTest(){
            SimpleArray actual = new SimpleArray(ARRAY_WITH_ZERO);
            actual = streamService.replaceIfZeroStream(actual);
            Assert.assertArrayEquals(EXPECTED_ARRAY, actual.getArray());
    }
}
