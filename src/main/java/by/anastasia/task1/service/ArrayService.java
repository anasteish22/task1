package by.anastasia.task1.service;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArrayService {
    int calculateSum(CustomArray array) throws ArrayException;
    double calculateAverage(CustomArray array) throws ArrayException;
    int findMin(CustomArray array) throws ArrayException;
    int findMax(CustomArray array) throws ArrayException;
    int countPositive(CustomArray array) throws ArrayException;
    int countNegative(CustomArray array) throws ArrayException;
    int[] replaceElements(CustomArray array) throws ArrayException;
}
