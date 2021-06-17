package by.demeshko.array.parser;

import java.util.List;

public interface ArrayParser {

    List<int[]> parseStringToArray(List<String> lines);

    int[] parseStringToArrayStream(List<String> lines);
}
