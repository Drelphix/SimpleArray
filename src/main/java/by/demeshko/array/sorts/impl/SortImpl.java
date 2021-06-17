package by.demeshko.array.sorts.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.exception.ArrayException;
import by.demeshko.array.sorts.Sort;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SortImpl implements Sort {

    private static final Logger logger = LogManager.getLogger();
    private static final String ARRAY_IS_SORTED = "Array is already sorted.";


    public void sortQuickSort(SimpleArray simpleArray, int left, int right) {
        try {
            ArrayValidator.checkArrayLength(simpleArray.getArray());
            if (simpleArray.getArray().length == 1) {
                logger.info(ARRAY_IS_SORTED);
                return;
            }
            if (left >= right) {
                return;
            }
            int point = left + (right - left) / 2;
            int middle = simpleArray.getItem(point);
            int leftPoint = left;
            int rightPoint = right;
            while (leftPoint <= rightPoint) {
                while (simpleArray.getItem(leftPoint) < middle) {
                    leftPoint++;
                }
                while (simpleArray.getItem(rightPoint) > middle) {
                    rightPoint--;
                }
                if (leftPoint <= rightPoint) {
                    swapItems(simpleArray, leftPoint, rightPoint);
                    leftPoint++;
                    rightPoint--;
                }
            }
            if (left < leftPoint) {
                sortQuickSort(simpleArray, left, rightPoint);
            }
            if (right > rightPoint) {
                sortQuickSort(simpleArray, leftPoint, right);
            }
        } catch (ArrayException e) {
            e.printStackTrace();
        }

    }

    public void sortBubbleSort(SimpleArray simpleArray) {
        try {
            ArrayValidator.checkArrayLength(simpleArray.getArray());
            if (simpleArray.getArray().length == 1) {
                logger.info(ARRAY_IS_SORTED);
                return;
            }
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 1; i < simpleArray.getLength(); i++) {
                    if (simpleArray.getItem(i - 1) > simpleArray.getItem(i)) {
                        swapItems(simpleArray, i - 1, i);
                        sorted = false;
                    }
                }
            }
        } catch (ArrayException e) {
            e.printStackTrace();
        }
    }

    public void sortMergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        System.arraycopy(array, 0, leftArray, 0, middle);
        for (int i = middle; i < length; i++) {
            rightArray[i - middle] = array[i];
        }
        sortMergeSort(leftArray, middle);
        sortMergeSort(rightArray, length - middle);
        merge(array, leftArray, rightArray, middle, length - middle);
    }

    public void swapItems(SimpleArray simpleArray, int first, int second) {
        int temp = simpleArray.getItem(first);
        int secondValue = simpleArray.getItem(second);

        simpleArray.setItem(secondValue, first);
        simpleArray.setItem(temp, second);
    }

    private void merge(int[] array, int[] leftArray,
                       int[] rightArray, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            array[k++] = leftArray[i++];
        }
        while (j < right) {
            array[k++] = rightArray[j++];
        }
    }
}
