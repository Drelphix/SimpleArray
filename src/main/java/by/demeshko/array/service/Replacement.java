package by.demeshko.array.service;

import by.demeshko.array.entity.SimpleArray;

public class Replacement {

    public SimpleArray replaceIfZero(SimpleArray simpleArray) {
        for (int i = 0; i < simpleArray.getLength(); i++) {
            if (simpleArray.getItem(i) == 0) {
                simpleArray.setItem(-5, i);
            }
        }
        return simpleArray;
    }
}
