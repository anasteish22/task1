package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayAverageCounter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayAverageCounterImplTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testCountAveragePositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayAverageCounter averageCounter = new ArrayAverageCounterImpl();
        double actual = averageCounter.countAverage(customArray);
        double expected = 3.2;
        Assert.assertEquals(expected, actual);
    }
}