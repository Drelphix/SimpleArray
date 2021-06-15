package by.demeshko.array.validator;

import by.demeshko.array.exception.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

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


    public static boolean checkCorrectArrayLine(String line, String regex) {
        return true;
    }
}
