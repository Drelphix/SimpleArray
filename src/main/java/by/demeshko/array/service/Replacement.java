package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Replacement {
    private static final Logger logger = LogManager.getLogger("Replacement");

    public SimpleArray replaceIfZero(SimpleArray simpleArray) {
        if(simpleArray.getLength() == 0){
            logger.info("Nothing to replace. Array's length is 0");
        }
        for (int i = 0; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) == 0) {
                simpleArray.setItem(-5, i);
            }
        }
        return simpleArray;
    }
}
