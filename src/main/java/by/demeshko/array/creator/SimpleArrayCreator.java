package by.demeshko.array.creator;

import by.demeshko.array.entity.SimpleArray;

import java.util.List;

public interface SimpleArrayCreator {

    SimpleArray createSimpleArray(List<int[]> arrays);

    SimpleArray createSimpleArrayStream(int[] array);
}
