package by.demeshko.array.sorts;

import by.demeshko.array.entity.SimpleArray;

public interface Sort {

    void sortQuickSort(SimpleArray simpleArray, int left, int right);

    void sortBubbleSort(SimpleArray simpleArray);

    void sortMergeSort(int[] array, int length);

    void swapItems(SimpleArray simpleArray, int first, int second);
}
