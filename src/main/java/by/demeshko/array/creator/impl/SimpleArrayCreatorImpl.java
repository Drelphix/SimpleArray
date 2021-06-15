package by.demeshko.array.creator.impl;

import by.demeshko.array.entity.SimpleArray;

import java.util.List;

public class SimpleArrayCreatorImpl {

    public SimpleArray createSimpleArray(List<int[]> arrays){
    int[] finalArray = new int[0];
        for (int i = 0; i < arrays.size()-1; i++) {
            finalArray = combineArrays(finalArray,arrays.get(i));
        }
        return new SimpleArray(finalArray);
    }

    public int[] combineArrays(int[] firstArray, int[] secondArray){
        int[] sum = new int[firstArray.length+secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sum[i] = firstArray[i];
            count++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            sum[count] = secondArray[i];
            count++;
        }
        return sum;
    }
}
