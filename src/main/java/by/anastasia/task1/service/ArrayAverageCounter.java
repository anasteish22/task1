package by.anastasia.task1.service;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArrayAverageCounter {
    double countAverage(CustomArray array) throws ArrayException;
}
