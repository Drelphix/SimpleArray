package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Search {

    private static final Logger logger = LogManager.getLogger("Search");
    public int findMaximum(SimpleArray simpleArray) {
        try {
            int max = simpleArray.getItem(0);
            for (int i = 1; i < simpleArray.getLength(); i++) {
                if (simpleArray.getItem(i) > max) {
                    max = simpleArray.getItem(i);
                }
            }
            return max;
        }catch (ArrayIndexOutOfBoundsException exception){
            logger.error(exception);
        }
        return 0;
    }

    public int findMinimum(SimpleArray simpleArray) {
        try {
            int min = simpleArray.getItem(0);

            for (int i = 0; i < simpleArray.getLength(); i++) {
                if (simpleArray.getItem(i) < min) {
                    min = simpleArray.getItem(i);
                }
            }
            return min;
        } catch (ArrayIndexOutOfBoundsException exception){
            logger.error(exception);
        }
        return 0;
    }

    public int[] findPositiveAndNegative(SimpleArray simpleArray){
        int[] array = {0, 0};
        try {
            for (int i = 0; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) > 0){
                array[0]++;
            } else if(simpleArray.getItem(i) < 0){
                array[1]++;
            }
        }
        } catch (ArrayIndexOutOfBoundsException exception){
            logger.error(exception);
        }
        return array;
    }
}
