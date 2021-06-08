package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import org.junit.Assert;
import org.junit.Test;

public class ReplacementTest {
    Replacement replacement = new Replacement();
    int[] ARRAY_WITH_ZERO = {0, 5, 4, 8, -1, 0, 14, -12, -6};
    int[] EXPECTED_ARRAY = {-5, 5, 4, 8, -1, -5, 14, -12, -6};

    @Test
    public void testReplaceIfZero() {
        SimpleArray testArray = new SimpleArray(ARRAY_WITH_ZERO);
        testArray = replacement.replaceIfZero(testArray);

        Assert.assertArrayEquals(EXPECTED_ARRAY, testArray.getArray());
    }

}
