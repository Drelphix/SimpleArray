package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.impl.ReplacementImpl;
import org.junit.Assert;
import org.junit.Test;

public class ReplacementTest {
    public static final int[] ARRAY_WITH_ZERO = {0, 5, 4, 8, -1, 0, 14, -12, -6};
    public static final int[] EXPECTED_ARRAY = {-5, 5, 4, 8, -1, -5, 14, -12, -6};
    Replacement replacementImpl = new ReplacementImpl();

    @Test
    public void testReplaceIfZero() {
        SimpleArray actual = new SimpleArray(ARRAY_WITH_ZERO);
        replacementImpl.replaceIfZero(actual);
        Assert.assertArrayEquals(EXPECTED_ARRAY, actual.getArray());
    }

}
