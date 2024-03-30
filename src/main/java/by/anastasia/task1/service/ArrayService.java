package by.anastasia.task1.service;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArrayService {
    int calculateSum(CustomArray array);
    double calculateAverage(CustomArray array);
    int findMin(CustomArray array);
    int findMax(CustomArray array);
    int countPositive(CustomArray array);
    int countNegative(CustomArray array);
    int[] addToEvens(CustomArray array, int num);
    int[] addToOdds(CustomArray array, int num);
}
