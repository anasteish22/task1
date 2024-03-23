package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayAverageCounter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayAverageCounterImpl implements ArrayAverageCounter {
    static Logger logger = LogManager.getLogger();
    @Override
    public double countAverage(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            logger.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        ArraySumCounterImpl arraySumCounter = new ArraySumCounterImpl();
        int sum = arraySumCounter.countSum(array);
        double average;

        average = (double) sum / array.length();
        logger.log(Level.INFO, "The average is " + average);
        return average;
    }
}
