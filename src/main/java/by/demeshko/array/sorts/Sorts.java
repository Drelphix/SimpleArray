package by.demeshko.array.sorts;

import by.demeshko.array.entity.SimpleArray;

public class Sorts {

    public SimpleArray sortQuickSort(SimpleArray simpleArray, int left, int right) {
        if (left >= right) {
            return null;
        }
        int point = left + (right - left) / 2;
        int middle = simpleArray.getItem(point);

        int l = left, r = right;
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
        return simpleArray;
    }

    public SimpleArray sortBubbleSort(SimpleArray simpleArray) {
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
        return simpleArray;
    }

    public SimpleArray sortMergeSort(SimpleArray simpleArray) {

        return simpleArray;
    }

    private SimpleArray swapItems(SimpleArray simpleArray, int first, int second) {
        int temp = simpleArray.getItem(first);
        int secondValue = simpleArray.getItem(second);

        simpleArray.setItem(secondValue, first);
        simpleArray.setItem(temp, second);
        return simpleArray;
    }
}
