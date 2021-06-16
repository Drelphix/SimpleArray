package by.demeshko.array.service.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.Search;

public class SearchImpl implements Search {

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
