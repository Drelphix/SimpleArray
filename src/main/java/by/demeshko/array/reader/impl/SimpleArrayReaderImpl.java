package by.demeshko.array.reader.impl;

import by.demeshko.array.reader.SimpleArrayReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleArrayReaderImpl implements SimpleArrayReader {
    private static final String DEFAULT_ARRAY_FILE_PATH = "./files/SimpleArrayTest.txt";
    private static final Logger logger = LogManager.getLogger();
    private String filePath = "";

    public SimpleArrayReaderImpl() {
    }

    public SimpleArrayReaderImpl(String filePath) {
        this.filePath = filePath;
    }

    public List<String> readFile() {
        if (filePath.isEmpty()) {
            filePath = DEFAULT_ARRAY_FILE_PATH;
        }
        List<String> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line = null;
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    arrayList.add(line);
                }
            } while (line != null);
        } catch (FileNotFoundException e) {
            logger.error("Файл по указанному пути не был найден!");
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("Файл пустой!");
            e.printStackTrace();
        }
        return arrayList;
    }


}
