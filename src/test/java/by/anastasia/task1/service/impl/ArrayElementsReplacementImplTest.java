package by.anastasia.task1.service.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.service.ArrayElementsReplacement;
import by.anastasia.task1.service.ArrayMinMaxFinder;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ArrayElementsReplacementImplTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testReplaceElementsPositive() throws ArrayException {
        int[] array = {4, 1, 6, 2, 3};
        CustomArray customArray = new CustomArray(array);
        ArrayElementsReplacement elementsReplacement = new ArrayElementsReplacementImpl();
        int[] actual = elementsReplacement.replaceElements(customArray);
        int[] expected = new int[]{2, 4, 2, 2, 6};
        Assert.assertEquals(expected, actual);
    }
}