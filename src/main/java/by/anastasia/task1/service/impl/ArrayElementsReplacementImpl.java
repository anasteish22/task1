package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayElementsReplacement;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayElementsReplacementImpl implements ArrayElementsReplacement {
    static Logger logger = LogManager.getLogger();
    @Override
    public int[] replaceElements(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            logger.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        int length = array.length();
        int[] newArray = new int[length];

        for (int i = 0; i < array.length(); i++) {
            if (array.getElement(i) % 2 == 0) {
                newArray[i] = 2;
            } else {
                newArray[i] = array.getElement(i) + 3;
            }
        }
        logger.log(Level.INFO, "The changed array is " + Arrays.toString(newArray));
        return newArray;
    }
}
