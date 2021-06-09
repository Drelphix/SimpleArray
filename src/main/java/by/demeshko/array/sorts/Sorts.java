package by.demeshko.array.sorts;

import by.demeshko.array.entity.SimpleArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Sorts {

    private static final Logger logger = LogManager.getLogger("Sorts");

    public void sortQuickSort(SimpleArray simpleArray, int left, int right) {
        checkArrayLength(simpleArray);
        if (left >= right) {
            return;
        }
        int point = left + (right - left) / 2;
        int middle = simpleArray.getItem(point);

        int l = left;
        int r = right;
        while (l <= r) {
            while (simpleArray.getItem(l) < middle) {
                l++;
            }
            while (simpleArray.getItem(r) > middle) {
                r--;
            }
            if (l <= r) {
                swapItems(simpleArray, l, r);
                l++;
                r--;
            }

        }
        if (left < l) {
            sortQuickSort(simpleArray, left, r);

        }
        if (right > r) {
            sortQuickSort(simpleArray, l, right);
        }
    }

    public void sortBubbleSort(SimpleArray simpleArray) {
        checkArrayLength(simpleArray);
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

    }

    public SimpleArray sortMergeSort(SimpleArray simpleArray) {
        checkArrayLength(simpleArray);

        return simpleArray;
    }

    private void swapItems(SimpleArray simpleArray, int first, int second) {
        int temp = simpleArray.getItem(first);
        int secondValue = simpleArray.getItem(second);

        simpleArray.setItem(secondValue, first);
        simpleArray.setItem(temp, second);
    }

    private void checkArrayLength(SimpleArray simpleArray){
        int length = simpleArray.getLength();
        if(length <= 1){
            logger.info("Array's length is " + length);
            logger.info("Array is already sorted");
        }
    }
}
