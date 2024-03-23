package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayPosNegCounter;
import by.anastasia.task1.service.ArraySumCounter;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArraySumCounterImplTest {

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
        ArraySumCounter sumCounter = new ArraySumCounterImpl();
        int actual = sumCounter.countSum(customArray);
        int expected = 16;
        Assert.assertEquals(expected, actual);
    }
}