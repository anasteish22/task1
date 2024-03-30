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
    public int calculateSum(CustomArray array) {
        int sum = Arrays.stream(array.getArray())
                .sum();
        LOGGER.log(Level.INFO, "The sum is " + sum);
        return sum;
    }

    @Override
    public double calculateAverage(CustomArray array) {
        double average = Arrays.stream(array.getArray())
                .average()
                .getAsDouble();
        LOGGER.log(Level.INFO, "The average is " + average);
        return average;
    }

    @Override
    public int findMin(CustomArray array) {
        int min = Arrays.stream(array.getArray())
                .min()
                .getAsInt();
        LOGGER.log(Level.INFO, "The min is " + min);
        return min;
    }

    @Override
    public int findMax(CustomArray array) {
        int max = Arrays.stream(array.getArray())
                .max()
                .getAsInt();
        LOGGER.log(Level.INFO, "The max is " + max);
        return max;
    }

    @Override
    public int countPositive(CustomArray array) {
        int pos = (int) Arrays.stream(array.getArray())
                .filter(n -> n > 0)
                .count();
        LOGGER.log(Level.INFO, "The num of positives is " + pos);
        return pos;
    }

    @Override
    public int countNegative(CustomArray array) {
        int neg = (int) Arrays.stream(array.getArray())
                .filter(n -> n < 0)
                .count();
        LOGGER.log(Level.INFO, "The num of negatives is " + neg);
        return neg;
    }

    @Override
    public int[] addToEvens(CustomArray array, int num) {
        int[] newArray = Arrays.stream(array.getArray())
                .map(n -> n % 2 == 0 ? n + num : n)
                .toArray();
        LOGGER.log(Level.INFO, "Evens are plussed with " + num
                + "\nThe changed array is " + Arrays.toString(newArray));
        return newArray;
    }

    @Override
    public int[] addToOdds(CustomArray array, int num) {
        int[] newArray = Arrays.stream(array.getArray())
                .map(n -> n % 2 == 0 ? n : n + num)
                .toArray();
        LOGGER.log(Level.INFO, "Odds are plussed with " + num
                + "\nThe changed array is " + Arrays.toString(newArray));
        return newArray;
    }
}