package by.anastasia.task1.service;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArraySumCounter {
    int countSum(CustomArray array) throws ArrayException;
}
