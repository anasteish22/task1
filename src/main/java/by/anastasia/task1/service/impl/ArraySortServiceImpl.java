package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArraySortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArraySortServiceImpl implements ArraySortService {
    static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void sortBubble(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        LOGGER.log(Level.INFO, "The original array: "
                + Arrays.toString(array.getArray()));

        int[] tempArray = array.getArray();

        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = tempArray.length - 1; j > i; j--) {
                if (tempArray[j - 1] > tempArray[j]) {
                    int temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        array.setArray(tempArray);
        LOGGER.log(Level.INFO, "The sorted array: "
                + Arrays.toString(array.getArray())
                + " (bubble sort)");
    }

    @Override
    public void sortSelection(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        LOGGER.log(Level.INFO, "The original array: "
                + Arrays.toString(array.getArray()));

        int[] tempArray = array.getArray();

        for (int i = 0; i < tempArray.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] < tempArray[smallest]) {
                    smallest = j;
                }
            }
            int temp = tempArray[smallest];
            tempArray[smallest] = tempArray[i];
            tempArray[i] = temp;
        }

        array.setArray(tempArray);
        LOGGER.log(Level.INFO, "The sorted array: "
                + Arrays.toString(array.getArray())
                + " (selection sort)");
    }

    @Override
    public void sortInsertion(CustomArray array) throws ArrayException {
        if (array.length() < 1) {
            LOGGER.log(Level.ERROR, "The array is empty");
            throw new ArrayException("The array is empty");
        }

        LOGGER.log(Level.INFO, "The original array: "
                + Arrays.toString(array.getArray()));

        int[] tempArray = array.getArray();

        for (int i = 1; i < tempArray.length; i++) {
            int current = tempArray[i];
            int j = i - 1;

            while (j >= 0 && current < tempArray[j]) {
                tempArray[j + 1] = tempArray[j];
                j--;
            }
            tempArray[j + 1] = current;
        }
        array.setArray(tempArray);
        LOGGER.log(Level.INFO, "The sorted array: "
                + Arrays.toString(array.getArray())
                + " (insertion sort)");
    }
}