package by.demeshko.array.service.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.exception.ArrayException;
import by.demeshko.array.service.Definition;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DefinitionImpl implements Definition {
    private static final Logger logger = LogManager.getLogger();

    public double findAverage(SimpleArray simpleArray) {
        try {
            ArrayValidator.checkArrayLength(simpleArray.getArray());
            return (double) findSum(simpleArray) / simpleArray.getLength();
        } catch (ArrayException e) {
            logger.error("Сan not be divided by zero!");
        }
        return 0.0;
    }

    public int findSum(SimpleArray simpleArray) {
        int sum = 0;
        for (int i = 0; i < simpleArray.getLength(); i++) {
            sum += simpleArray.getItem(i);
        }
        return sum;
    }

}
