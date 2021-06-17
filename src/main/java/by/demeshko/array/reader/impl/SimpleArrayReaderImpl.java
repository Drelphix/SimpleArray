package by.demeshko.array.reader.impl;

import by.demeshko.array.exception.ArrayException;
import by.demeshko.array.reader.SimpleArrayReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleArrayReaderImpl implements SimpleArrayReader {
    private static final String DEFAULT_ARRAY_FILE_PATH = "./files/SimpleArrayTest.txt";
    private static final Logger logger = LogManager.getLogger();

    public SimpleArrayReaderImpl() {}

    public List<String> readFile(String filePath) throws ArrayException {
        if (filePath.isEmpty()) {
            filePath = DEFAULT_ARRAY_FILE_PATH;
            logger.info(new StringBuilder().append("File not found. ")
                    .append("Using default path: ")
                    .append(DEFAULT_ARRAY_FILE_PATH));
        }
        List<String> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    arrayList.add(line);
                }
            } while (line != null);
        } catch (FileNotFoundException e) {
            logger.error(new StringBuilder().append("File ").
                    append(filePath).append(" not found!"));
            throw new ArrayException();
        } catch (IOException e) {
            logger.error(new StringBuilder().append("File ")
                    .append(filePath).append(" is empty!"));
            throw new ArrayException();
        }
        return arrayList;
    }

    public List<String> readFileStream(String filePath) throws ArrayException {
        if (filePath.isEmpty()) {
            filePath = DEFAULT_ARRAY_FILE_PATH;
            logger.info(new StringBuilder().append("File not found. ")
                    .append("Using default path: ")
                    .append(DEFAULT_ARRAY_FILE_PATH));
        }
        Path path = Paths.get(filePath);
        try (Stream<String> lines = Files.lines(path)) {
            return lines.collect(Collectors.toCollection(ArrayList::new));
        } catch (IOException e) {
            logger.error(new StringBuilder().append("File ").
                    append(filePath).append(" not found!"));
            throw new ArrayException();
        }

    }


}
