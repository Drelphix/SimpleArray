package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;


public interface StreamService {

    int findStreamMinimum(SimpleArray simpleArray);

    int findStreamMaximum(SimpleArray simpleArray);

    int findStreamPositive(SimpleArray simpleArray);

    int findStreamNegative(SimpleArray simpleArray);

    SimpleArray replaceIfZeroStream(SimpleArray simpleArray);

    SimpleArray sortStream(SimpleArray simpleArray);

    double findAverageStream(SimpleArray simpleArray);

    int findSumStream(SimpleArray simpleArray);
}
