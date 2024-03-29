package by.anastasia.task1.observer;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArrayStatisticsObserver {
    void changeArrayElement(CustomArray array) throws ArrayException;
}
