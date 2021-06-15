package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;

import java.util.stream.IntStream;

public interface StreamService {

    public int findStreamMinimum(SimpleArray simpleArray);

    public int findStreamMaximum(SimpleArray simpleArray);

    public int findStreamPositive(SimpleArray simpleArray);

    public int findStreamNegative(SimpleArray simpleArray);

    public SimpleArray replaceIfZeroStream(SimpleArray simpleArray);

    public SimpleArray sortStream(SimpleArray simpleArray);

    public double findAverageStream(SimpleArray simpleArray);

    public int findSumStream(SimpleArray simpleArray);
}
