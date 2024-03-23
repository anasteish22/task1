package by.anastasia.task1.service;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArrayPosNegCounter {
    int countPositive(CustomArray array) throws ArrayException;
    int countNegative(CustomArray array) throws ArrayException;
}
