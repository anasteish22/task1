package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArraySumCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySumCounterImpl implements ArraySumCounter {
    static Logger logger = LogManager.getLogger();
    @Override
    public int countSum(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            logger.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        int sum = 0;

        for (int i = 0; i < array.length(); i++) {
            sum += array.getElement(i);
        }

        logger.log(Level.INFO, "The sum is " + sum);
        return sum;
    }
}
