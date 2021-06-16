package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;

public interface Search {

    int findMaximum(SimpleArray simpleArray);

    int findMinimum(SimpleArray simpleArray);

    int findPositive(SimpleArray simpleArray);

    int findNegative(SimpleArray simpleArray);
}
