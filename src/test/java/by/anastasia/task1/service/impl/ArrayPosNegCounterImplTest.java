package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayPosNegCounter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayPosNegCounterImplTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testCountPositivePositive() throws ArrayException {
        int[] array = {-4, 1, -6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayPosNegCounter posCounter = new ArrayPosNegCounterImpl();
        int actual = posCounter.countPositive(customArray);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativePositive() throws ArrayException {
        int[] array = {-4, 1, -6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayPosNegCounter negCounter = new ArrayPosNegCounterImpl();
        int actual = negCounter.countNegative(customArray);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}