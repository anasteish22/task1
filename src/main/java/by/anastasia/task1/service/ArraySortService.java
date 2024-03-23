package by.anastasia.task1.service;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface ArraySortService {
    public void sortBubble(CustomArray array) throws ArrayException;
    public void sortSelection(CustomArray array) throws ArrayException;
    public void sortInsertion(CustomArray array) throws ArrayException;
}
