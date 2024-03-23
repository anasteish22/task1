package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayMinMaxFinder;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayMinMaxFinderImpl implements ArrayMinMaxFinder {
    static Logger logger = LogManager.getLogger();
    @Override
    public int findMin(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            logger.log(Level.ERROR, "The array is empty");
            throw new ArrayException ("The array is empty");
        }

        int[] sortArray = Arrays.copyOf(array.getArray(), array.length());
        Arrays.sort(sortArray); //rewrite the sorting

        int min = sortArray[0];
        logger.log(Level.INFO, "The min is " + min);
        return min;
    }

    @Override
    public int findMax(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            throw new ArrayException ("The array is empty");
        }

        int[] sortArray = Arrays.copyOf(array.getArray(), array.length());
        Arrays.sort(sortArray); //rewrite the sorting

        int max = sortArray[sortArray.length - 1];
        logger.log(Level.INFO, "The max is " + max);
        return max;
    }
}
