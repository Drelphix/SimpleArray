package by.demeshko.array.sorts.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.exception.ArrayException;
import by.demeshko.array.sorts.Sort;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SortImpl implements Sort {

    private static final Logger logger = LogManager.getLogger();
    private static final String ARRAY_IS_SORTED = "Массив уже отсортирован. Его длина равна 1 элементу";

    private void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

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
        int mid = length / 2;
        int[] l = new int[mid];
        int[] r = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            r[i - mid] = array[i];
        }
        sortMergeSort(l, mid);
        sortMergeSort(r, length - mid);
        merge(array, l, r, mid, length - mid);
    }

    public void swapItems(SimpleArray simpleArray, int first, int second) {
        int temp = simpleArray.getItem(first);
        int secondValue = simpleArray.getItem(second);

        simpleArray.setItem(secondValue, first);
        simpleArray.setItem(temp, second);
    }
}
