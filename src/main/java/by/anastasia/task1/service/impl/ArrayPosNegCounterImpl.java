package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayPosNegCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayPosNegCounterImpl implements ArrayPosNegCounter {
    static Logger logger = LogManager.getLogger();
    @Override
    public int countPositive(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            logger.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        int pos = 0;

        for (int i = 0; i < array.length(); i++) {
            if (array.getElement(i) > 0) {
                pos++;
            }
        }

        logger.log(Level.INFO, "The num of positives is " + pos);
        return pos;
    }

    @Override
    public int countNegative(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            throw new ArrayException("The array is empty");
        }

        int neg = 0;

        for (int i = 0; i < array.length(); i++) {
            if (array.getElement(i) < 0) {
                neg++;
            }
        }

        logger.log(Level.INFO, "The num of negatives is " + neg);
        return neg;
    }
}
