package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayServiceImpl implements ArrayService {
    static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int calculateSum(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        int sum = 0;

        for (int i = 0; i < array.length(); i++) {
            sum += array.getElement(i);
        }

        LOGGER.log(Level.INFO, "The sum is " + sum);
        return sum;
    }

    @Override
    public double calculateAverage(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        int sum = calculateSum(array);
        double average;

        average = (double) sum / array.length();
        LOGGER.log(Level.INFO, "The average is " + average);
        return average;
    }

    @Override
    public int findMin(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        int min = array.getElement(0);

        for (int i = 1; i < array.length(); i++) {
            if (array.getElement(i) < min) {
                min = array.getElement(i);
            }
        }

        LOGGER.log(Level.INFO, "The min is " + min);
        return min;
    }

    @Override
    public int findMax(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            throw new ArrayException("The array is empty");
        }

        int max = array.getElement(0);

        for (int i = 1; i < array.length(); i++) {
            if (array.getElement(i) > max) {
                max = array.getElement(i);
            }
        }

        LOGGER.log(Level.INFO, "The max is " + max);
        return max;
    }

    @Override
    public int countPositive(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        int pos = 0;

        for (int i = 0; i < array.length(); i++) {
            if (array.getElement(i) > 0) {
                pos++;
            }
        }

        LOGGER.log(Level.INFO, "The num of positives is " + pos);
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

        LOGGER.log(Level.INFO, "The num of negatives is " + neg);
        return neg;
    }

    @Override
    public int[] replaceElements(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
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
        LOGGER.log(Level.INFO, "The changed array is " + Arrays.toString(newArray));
        return newArray;
    }
}