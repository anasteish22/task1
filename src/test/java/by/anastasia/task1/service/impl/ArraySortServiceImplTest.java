package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArraySortService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortServiceImplTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testSortBubblePositive() throws ArrayException {
        int[] array = {3, 7, 2, 1, 8};
        CustomArray customArray = new CustomArray(array);
        ArraySortService sortService = new ArraySortServiceImpl();
        sortService.sortBubble(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 7, 8};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortSelectionPositive() throws ArrayException {
        int[] array = {3, 7, 2, 1, 8};
        CustomArray customArray = new CustomArray(array);
        ArraySortService sortService = new ArraySortServiceImpl();
        sortService.sortSelection(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 7, 8};
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSortInsertionPositive() throws ArrayException {
        int[] array = {3, 7, 2, 1, 8};
        CustomArray customArray = new CustomArray(array);
        ArraySortService sortService = new ArraySortServiceImpl();
        sortService.sortInsertion(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 7, 8};
        Assert.assertEquals(expected, actual);
    }
}