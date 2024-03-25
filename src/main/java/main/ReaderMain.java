package main;

import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.reader.ArrayReader;
import by.anastasia.task1.reader.impl.ArrayReaderImpl;

import java.util.Arrays;

public class ReaderMain {
    static ArrayReader arrayReader = new ArrayReaderImpl();

    public static void main(String[] args) throws ArrayException {
        int[] array = arrayReader.readArray("data//arrays.txt");
        System.out.println(Arrays.toString(array));
    }
}
