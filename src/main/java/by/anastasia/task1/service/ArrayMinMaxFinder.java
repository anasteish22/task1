package by.anastasia.task1.service;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArrayMinMaxFinder {
    int findMin(CustomArray array) throws ArrayException;
    int findMax(CustomArray array) throws ArrayException;
}
