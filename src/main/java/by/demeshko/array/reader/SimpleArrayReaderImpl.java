package by.demeshko.array.reader;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SimpleArrayReaderImpl {
    private static final String DEFAULT_ARRAY_FILE_PATH = "D:\\java\\SimpleArray\\files\\SimpleArrayTest.txt";
    private static final Logger logger = LogManager.getLogger();
    //private static final String REGEX = "\\d,| \\d -| \\d;|\\d ";
    private static final String REGEX = "\\d,+";
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
        List<String[]> strings = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            Pattern arrayPattern = Pattern.compile(REGEX);
            while (line != null) {
                if (ArrayValidator.checkCorrectArrayLine(line, REGEX)) {
                    strings.add(arrayPattern.split(line));
                }
                line = bufferedReader.readLine();
            }
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

    private int[] transformLinesToArray(List<String[]> list){
      List<Integer> integerList = new ArrayList<>();
        for (String[] line : list) {
            for(String item : line){
               integerList.add(Integer.valueOf(item));
            }
        }
        int[] array = new int[integerList.size()];
        for (int i = 0; i < integerList.size(); i++) {
            array[i] = integerList.get(i);
        }
        return array;
    }
}
