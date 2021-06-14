package by.demeshko.array.reader.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.reader.SimpleArrayReader;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleArrayReaderImpl implements SimpleArrayReader {
    private static final String DEFAULT_ARRAY_FILE_PATH = "D:\\java\\SimpleArray\\files\\SimpleArrayTest.txt";
    private static final Logger logger = LogManager.getLogger();
    private static final String REGEX = ",\\s|;\\s|;|\\s-\\s|\\s";
    private String filePath;

    public SimpleArrayReaderImpl() {
    }

    public SimpleArrayReaderImpl(String filePath) {
        this.filePath = filePath;
    }

    public SimpleArray readFile() { //fixme
        try {
            filePath.isEmpty();
        } catch (NullPointerException e) {
            filePath = DEFAULT_ARRAY_FILE_PATH;
        }
        int[] finalArray = new int[0];
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                int[] array = ArrayValidator.checkCorrectArrayLine(line, REGEX);
                if (array.length > 0) {
                    finalArray = combineArrays(finalArray,array);
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            logger.error("Файл по указанному пути не был найден!");
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("Файл пустой!");
        }
        return new SimpleArray(finalArray);
    }

    private int[] combineArrays(int[] firstArray, int[] secondArray){
        int[] sum = new int[firstArray.length+secondArray.length];
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            sum[i] = firstArray[i];
            count++;
        }
        for (int i = 0; i < secondArray.length; i++) {
            sum[count] = secondArray[i];
            count++;
        }
        return sum;
    }
}
