package by.anastasia.task1.reader;

import by.anastasia.task1.exception.ArrayException;

import java.util.List;

public interface ArrayReader {
    public List<int[]> readArray(String filename) throws ArrayException;
}
