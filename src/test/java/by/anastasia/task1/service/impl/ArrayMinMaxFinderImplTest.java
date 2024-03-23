package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayMinMaxFinder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class ArrayMinMaxFinderImplTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testFindMinPositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayMinMaxFinder minFinder = new ArrayMinMaxFinderImpl();
        int actual = minFinder.findMin(customArray);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxPositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayMinMaxFinder maxFinder = new ArrayMinMaxFinderImpl();
        int actual = maxFinder.findMax(customArray);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }
}