package main;

import by.anastasia.task1.comparator.ArrayLengthComparator;
import by.anastasia.task1.comparator.FirstElementComparator;
import by.anastasia.task1.comparator.IdComparator;
import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.util.IdGenerator;
import by.anastasia.task1.service.ArrayService;
import by.anastasia.task1.service.ArraySortService;
import by.anastasia.task1.service.impl.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static final Logger LOGGER = LogManager.getLogger();

    static ArrayService arrayService = new ArrayServiceImpl();
    static ArraySortService sortService = new ArraySortServiceImpl();

    static final CustomArray basicArray1 = new CustomArray(new int[]{5, -2, 1, 16, 10, 3});
    static final CustomArray basicArray2 = new CustomArray(new int[]{-6, -9, -4, -11, 1, 6, 5, -3, 0});
    static final CustomArray basicArray3 = new CustomArray(new int[]{8, 2, -7, 1, 13, 0, 7, 9});
    static final CustomArray emptyArray = new CustomArray(new int[]{});

    public static void main(String[] args) throws ArrayException {
        LOGGER.log(Level.INFO, "Basic array №1: " + Arrays.toString(basicArray1.getArray()));
        arrayService.calculateAverage(basicArray1);
        arrayService.addToEvens(basicArray1, 3);
        arrayService.addToOdds(basicArray1, 5);
        arrayService.findMin(basicArray1);
        arrayService.findMax(basicArray1);
        arrayService.countPositive(basicArray1);
        arrayService.countNegative(basicArray1);
        arrayService.calculateSum(basicArray1);
        sortService.sortBubble(basicArray1);

        LOGGER.log(Level.INFO, "Basic array №2: " + Arrays.toString(basicArray2.getArray()));
        arrayService.calculateAverage(basicArray2);
        arrayService.addToEvens(basicArray2, 5);
        arrayService.findMin(basicArray2);
        arrayService.findMax(basicArray2);
        arrayService.countPositive(basicArray2);
        arrayService.countNegative(basicArray2);
        arrayService.calculateSum(basicArray2);
        sortService.sortSelection(basicArray2);

        LOGGER.log(Level.INFO, "Basic array №3: " + Arrays.toString(basicArray3.getArray()));
        arrayService.calculateAverage(basicArray3);
        arrayService.addToEvens(basicArray3, 2);
        arrayService.findMin(basicArray3);
        arrayService.findMax(basicArray3);
        arrayService.countPositive(basicArray3);
        arrayService.countNegative(basicArray3);
        arrayService.calculateSum(basicArray3);
        sortService.sortInsertion(basicArray3);

//        LOGGER.log(Level.INFO, "Empty array: " + Arrays.toString(emptyArray.getArray()));
//        arrayService.calculateAverage(emptyArray);
//        arrayService.replaceElements(emptyArray);
//        arrayService.findMin(emptyArray);
//        arrayService.findMax(emptyArray);
//        arrayService.countPositive(emptyArray);
//        arrayService.countNegative(emptyArray);
//        arrayService.calculateSum(emptyArray);

        List<CustomArray> customArrayList = new ArrayList<>();
        customArrayList.add(basicArray1);
        customArrayList.add(basicArray3);
        customArrayList.add(basicArray2);

        IdComparator idComparator = new IdComparator();
        FirstElementComparator firstElementComparator = new FirstElementComparator();
        ArrayLengthComparator arrayLengthComparator = new ArrayLengthComparator();

        Collections.sort(customArrayList, idComparator);
        System.out.println(customArrayList);

        Collections.sort(customArrayList, firstElementComparator);
        System.out.println(customArrayList);

        Collections.sort(customArrayList, arrayLengthComparator);
        System.out.println(customArrayList);
    }
}