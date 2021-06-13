package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;

public interface Search {

    public int findMaximum(SimpleArray simpleArray);

    public int findMinimum(SimpleArray simpleArray);

    public int findPositive(SimpleArray simpleArray);

    public int findNegative(SimpleArray simpleArray);
}
