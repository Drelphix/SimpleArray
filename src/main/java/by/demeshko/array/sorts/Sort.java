package by.demeshko.array.sorts;

import by.demeshko.array.entity.SimpleArray;

public interface Sort {

    public void sortQuickSort(SimpleArray simpleArray, int left, int right);

    public void sortBubbleSort(SimpleArray simpleArray);

    public void sortMergeSort(SimpleArray simpleArray);

    public  void swapItems(SimpleArray simpleArray, int first, int second);
}
