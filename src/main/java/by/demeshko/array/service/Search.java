package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;

public class Search {

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

    public int[] findPositiveAndNegative(SimpleArray simpleArray){
        int[] array = {0, 0};

        for (int i = 0; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) > 0){
                array[0]++;
            } else if(simpleArray.getItem(i) < 0){
                array[1]++;
            }
        }
        return array;
    }
}
