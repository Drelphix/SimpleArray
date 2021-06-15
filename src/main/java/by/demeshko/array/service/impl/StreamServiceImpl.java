package by.demeshko.array.service.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.service.StreamService;

import java.util.stream.IntStream;

public class StreamServiceImpl implements StreamService {

    public int findStreamMinimum(SimpleArray simpleArray){
        return IntStream.of(simpleArray.getArray()).min().getAsInt();
    }

    public int findStreamMaximum(SimpleArray simpleArray){
        return IntStream.of(simpleArray.getArray()).max().getAsInt();
    }

    public int findStreamPositive(SimpleArray simpleArray){
        return (int) IntStream.of(simpleArray.getArray()).filter(num -> (num > 0)).count();
    }

    public int findStreamNegative(SimpleArray simpleArray){
        return (int) IntStream.of(simpleArray.getArray()).filter(num -> (num < 0)).count();
    }

    public SimpleArray replaceIfZeroStream(SimpleArray simpleArray){
        return new SimpleArray(IntStream.of(simpleArray.getArray()).map(i -> i != 0? i: -5).toArray());
    }

    public SimpleArray sortStream(SimpleArray simpleArray){
        return new SimpleArray(IntStream.of(simpleArray.getArray()).sorted().toArray());
    }

    public double findAverageStream(SimpleArray simpleArray){
        return IntStream.of(simpleArray.getArray()).average().getAsDouble();
    }

    public int findSumStream(SimpleArray simpleArray){
        return IntStream.of(simpleArray.getArray()).sum();
    }
}
