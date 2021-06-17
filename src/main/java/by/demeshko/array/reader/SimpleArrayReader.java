package by.demeshko.array.reader;

import by.demeshko.array.exception.ArrayException;

import java.util.List;

public interface SimpleArrayReader {

    List<String> readFile(String filePath) throws ArrayException;

    List<String> readFileStream(String filePath) throws ArrayException;
}
