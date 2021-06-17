package by.demeshko.array.parser.impl;

import by.demeshko.array.parser.ArrayParser;
import by.demeshko.array.validator.ArrayValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ArrayParserImpl implements ArrayParser {
    private static final String ARRAY_SPLIT_REGEX = ",\\s|;\\s|;|\\s-\\s|\\s";
    private static final String ARRAY_VALIDATE_REGEX = "-?\\d+";

    public List<int[]> parseStringToArray(List<String> lines) {
        List<int[]> arrayList = new ArrayList<>();
        for (String line : lines) {
            if (ArrayValidator.checkCorrectArrayLine(line, ARRAY_SPLIT_REGEX, ARRAY_VALIDATE_REGEX)) {
                Pattern arrayPattern = Pattern.compile(ARRAY_SPLIT_REGEX);
                String[] inputArray = arrayPattern.split(line);
                int[] finalArray = new int[inputArray.length];
                for (int i = 0; i < inputArray.length; i++) {
                    finalArray[i] = Integer.parseInt(inputArray[i]);
                }
                arrayList.add(finalArray);
            }
        }
        return arrayList;
    }

    public int[] parseStringToArrayStream(List<String> stringList) {
        return stringList.stream()
                .filter(i -> ArrayValidator.checkCorrectArrayLine(i, ARRAY_SPLIT_REGEX, ARRAY_VALIDATE_REGEX))
                .map(line -> line.split(ARRAY_SPLIT_REGEX))
                .flatMap(Arrays::stream).mapToInt(Integer::parseInt).toArray();

    }
}
