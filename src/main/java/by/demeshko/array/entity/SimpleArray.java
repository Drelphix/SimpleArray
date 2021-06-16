package by.demeshko.array.entity;

import by.demeshko.array.exception.ArrayException;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleArray {
    private static final Logger logger = LogManager.getLogger();
    private int[] array;

    public SimpleArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getItem(int position) {
        try {
            ArrayValidator.checkPosition(position, this.array);
            return array[position];
        } catch (ArrayException e) {
            logger.error("Такой позиции не существует в массиве!");
            e.printStackTrace();
        }
        return 0;
    }

    public void setItem(int item, int position) {
        try {
            ArrayValidator.checkPosition(position, this.array);
            this.array[position] = item;
        } catch (ArrayException e) {
            logger.error("Такой позиции не существует в массиве!");
            e.printStackTrace();
        }
    }

    public int getLength() {
        return this.array.length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Current array is: ");
        for (int i : this.array) {
            stringBuilder.append(i);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public boolean equals(SimpleArray simpleArray) {
        if (simpleArray == this) {
            return true;
        }

        if (simpleArray.getLength() == this.array.length) {
            for (int i = 0; i < this.array.length; i++) {
                if (simpleArray.array[i] != this.array[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
