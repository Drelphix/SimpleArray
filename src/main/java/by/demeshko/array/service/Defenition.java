package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;

public class Defenition{

    public double findAverage(SimpleArray simpleArray){
        return findSum(simpleArray)/simpleArray.getLength();
    }

    public int findSum(SimpleArray simpleArray){
        int sum = 0;

        for (int i = 0; i < simpleArray.getLength(); i++) {
            sum += simpleArray.getItem(i);
        }
        return sum;
    }

}
