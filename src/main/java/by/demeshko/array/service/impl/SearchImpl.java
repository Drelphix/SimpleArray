package by.demeshko.array.service.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.Search;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SearchImpl implements Search {

    private static final Logger logger = LogManager.getLogger();

    public int findMaximum(SimpleArray simpleArray) {
        int max = simpleArray.getItem(0);
        for (int i = 1; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) > max) {
                max = simpleArray.getItem(i);
            }
        }
        return max;
    }

    public int findMinimum(SimpleArray simpleArray) {
        int min = simpleArray.getItem(0);
        for (int i = 0; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) < min) {
                min = simpleArray.getItem(i);
            }
        }
        return min;

    }

    public int findPositive(SimpleArray simpleArray) {
        int positive = 0;
        for (int i = 0; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) > 0) {
                positive++;
            }
        }
        return positive;
    }

    public int findNegative(SimpleArray simpleArray) {
        int negative = 0;
        for (int i = 0; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) < 0) {
                negative++;
            }
        }
        return negative;
    }


}
