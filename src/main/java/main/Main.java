package main;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.impl.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Main {
    static final Logger LOGGER = LogManager.getLogger();
    static ArrayAverageCounterImpl averageCounter = new ArrayAverageCounterImpl();
    static ArrayElementsReplacementImpl elementsReplacement = new ArrayElementsReplacementImpl();
    static ArrayMinMaxFinderImpl minMaxFinder = new ArrayMinMaxFinderImpl();
    static ArrayPosNegCounterImpl posNegCounter = new ArrayPosNegCounterImpl();
    static ArraySumCounterImpl sumCounter = new ArraySumCounterImpl();

    static final CustomArray basicArray1 = new CustomArray(new int[]{5, -2, 1, 16, 10, 3});
    static final CustomArray basicArray2 = new CustomArray(new int[]{-6, -9, -4, -11, 1, 6});
    static final CustomArray basicArray3 = new CustomArray(new int[]{8, 2, -7, 1, 13, 0});
    static final CustomArray emptyArray = new CustomArray(new int[]{});

    public static void main(String[] args) throws ArrayException {
        LOGGER.log(Level.INFO, "Basic array №1: " + Arrays.toString(basicArray1.getArray()));
        averageCounter.countAverage(basicArray1);
        elementsReplacement.replaceElements(basicArray1);
        minMaxFinder.findMin(basicArray1);
        minMaxFinder.findMax(basicArray1);
        posNegCounter.countPositive(basicArray1);
        posNegCounter.countNegative(basicArray1);
        sumCounter.countSum(basicArray1);

        LOGGER.log(Level.INFO, "Basic array №2: " + Arrays.toString(basicArray2.getArray()));
        averageCounter.countAverage(basicArray2);
        elementsReplacement.replaceElements(basicArray2);
        minMaxFinder.findMin(basicArray2);
        minMaxFinder.findMax(basicArray2);
        posNegCounter.countPositive(basicArray2);
        posNegCounter.countNegative(basicArray2);
        sumCounter.countSum(basicArray2);

        LOGGER.log(Level.INFO, "Basic array №3: " + Arrays.toString(basicArray3.getArray()));
        averageCounter.countAverage(basicArray3);
        elementsReplacement.replaceElements(basicArray3);
        minMaxFinder.findMin(basicArray3);
        minMaxFinder.findMax(basicArray3);
        posNegCounter.countPositive(basicArray3);
        posNegCounter.countNegative(basicArray3);
        sumCounter.countSum(basicArray3);

        LOGGER.log(Level.INFO, "Empty array: " + Arrays.toString(emptyArray.getArray()));
        averageCounter.countAverage(emptyArray);
        elementsReplacement.replaceElements(emptyArray);
        minMaxFinder.findMin(emptyArray);
        minMaxFinder.findMax(emptyArray);
        posNegCounter.countPositive(emptyArray);
        posNegCounter.countNegative(emptyArray);
        sumCounter.countSum(emptyArray);
    }
}
