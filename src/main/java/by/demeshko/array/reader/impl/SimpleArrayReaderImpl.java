package by.demeshko.array.reader.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.reader.SimpleArrayReader;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.validation.Validator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SimpleArrayReaderImpl implements SimpleArrayReader {
    private static final String DEFAULT_ARRAY_FILE_PATH = "D:\\SimpleArray\\files\\SimpleArrayTest.txt";
    private static final Logger logger = LogManager.getLogger();
    private static final String REGEX = ",\\s|;\\s|;|\\s-\\s|\\s";
    private String filePath;

    public SimpleArrayReaderImpl() {
    }

    public SimpleArrayReaderImpl(String filePath) {
        this.filePath = filePath;
    }

    public SimpleArray readFile() {
        try {
           filePath.isEmpty();
        } catch (NullPointerException e){
            filePath = DEFAULT_ARRAY_FILE_PATH;
        }
        List<int[]> strings = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (line != null) {
                int[] array = ArrayValidator.checkCorrectArrayLine(line,REGEX);
                if(array.length > 0) {
                    strings.add(array);
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

        int[] array = transformLinesToArray(strings);

        return new SimpleArray(array);
    }

    private int[] transformLinesToArray(List<int[]> list){
      List<Integer> integerList = new ArrayList<>();
        for (int[] line : list) {
            for(int item : line){
               integerList.add(item);
            }
        }
        int[] array = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            array[i] = integerList.get(i);
        }
        return array;
    }
}
