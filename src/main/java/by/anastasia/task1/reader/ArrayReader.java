package by.anastasia.task1.reader;

import by.anastasia.task1.exception.ArrayException;

public interface ArrayReader {
    public int[] readArray(String filename) throws ArrayException;
}
