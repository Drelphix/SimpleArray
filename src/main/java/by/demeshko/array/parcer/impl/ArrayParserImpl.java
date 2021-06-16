package by.demeshko.array.parcer.impl;

import by.demeshko.array.parcer.ArrayParser;
import by.demeshko.array.validator.ArrayValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class ArrayParserImpl implements ArrayParser {
    private static final String ARRAY_SPLIT_REGEX = ",\\s|;\\s|;|\\s-\\s|\\s";
    private static final String ARRAY_VALIDATE_REGEX = "";

    public List<int[]> parseStringToArray (List<String> lines){
        List<int[]> arrayList = new ArrayList<>();
        for (String line : lines) {
            if(ArrayValidator.checkCorrectArrayLine(line,ARRAY_VALIDATE_REGEX)) {
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
}
