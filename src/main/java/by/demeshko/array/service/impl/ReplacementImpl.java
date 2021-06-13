package by.demeshko.array.service.impl;

import by.demeshko.array.entity.SimpleArray;
import by.demeshko.array.exception.ArrayException;
import by.demeshko.array.service.Replacement;
import by.demeshko.array.validator.ArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReplacementImpl implements Replacement {
    private static final Logger logger = LogManager.getLogger();

    public void replaceIfZero(SimpleArray simpleArray) {
        try {
            ArrayValidator.checkArrayLength(simpleArray.getArray());
            for (int i = 0; i < simpleArray.getLength(); i++) {
                if (simpleArray.getItem(i) == 0) {
                    simpleArray.setItem(-5, i);
                }
            }
        } catch (ArrayException e) {
            logger.info("Невозможно заменить в пустом массиве!");
        }
    }
}
