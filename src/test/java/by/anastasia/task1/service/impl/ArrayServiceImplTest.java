package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayServiceImplTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testCountSumPositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayService service = new ArrayServiceImpl();
        int actual = service.calculateSum(customArray);
        int expected = 16;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountAveragePositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayService service = new ArrayServiceImpl();
        double actual = service.calculateAverage(customArray);
        double expected = 3.2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMinPositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayService service = new ArrayServiceImpl();
        int actual = service.findMin(customArray);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxPositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayService service = new ArrayServiceImpl();
        int actual = service.findMax(customArray);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountPositivePositive() throws ArrayException {
        int[] array = {-4, 1, -6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayService service = new ArrayServiceImpl();
        int actual = service.countPositive(customArray);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativePositive() throws ArrayException {
        int[] array = {-4, 1, -6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayService service = new ArrayServiceImpl();
        int actual = service.countNegative(customArray);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReplaceElementsPositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayService service = new ArrayServiceImpl();
        int[] actual = service.replaceElements(customArray);
        int[] expected = new int[]{2, 4, 2, 2, 6};
        Assert.assertEquals(expected, actual);
    }
}