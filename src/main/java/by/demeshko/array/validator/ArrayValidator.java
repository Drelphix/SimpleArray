package by.demeshko.array.validator;

import by.demeshko.array.exception.ArrayException;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ArrayValidator {

    public static void checkPosition(int position, int[] array) throws ArrayException {
        if ((position < 0) || (position >= array.length)) {
            throw new ArrayException();
        }
    }

    public static void checkArrayLength(int[] array) throws ArrayException {
        if (array.length == 0) {
            throw new ArrayException();
        }
    }


    public static boolean checkCorrectArrayLine(String line, String splitRegex, String matchRegex) {
        Pattern pattern = Pattern.compile(splitRegex);
        String[] words = pattern.split(line);
        for (String world : words) {
            if (!world.matches(matchRegex)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCorrectArrayLineStream(String line, String splitRegex, String matchRegex) {
        return Arrays.stream(line.split(splitRegex)).anyMatch(i -> i.matches(matchRegex));
    }

}
