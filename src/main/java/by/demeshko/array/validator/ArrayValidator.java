package by.demeshko.array.validator;

import by.demeshko.array.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidator {

    private static final Logger logger = LogManager.getLogger();

    public static void checkPosition(int position, int[] array) throws ArrayException {
        if ((position < 0) || (position >= array.length)) {
            throw new ArrayException("Запрашиваемая позиция вышла за границы массива!");
        }
    }

    public static void checkArrayLength(int[] array) throws ArrayException {
        if (array.length == 0) {
            throw new ArrayException("Массив пустой!");
        }
    }

    public static void checkSortedArray(int[] array) throws ArrayException {
        if (array.length == 1) {
            throw new ArrayException("Массив состоит из 1 элемента, значит он уже отсортирован!");
        }
    }

    public static boolean checkCorrectArrayLine(String line, String regex){
        logger.info(line);
        logger.info(line.matches(regex));
        return line.matches(regex);
    }
}