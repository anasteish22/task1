package main;

import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.reader.ArrayReader;
import by.anastasia.task1.reader.impl.ArrayReaderImpl;

import java.util.Arrays;
import java.util.List;

public class ReaderMain {
    static ArrayReader arrayReader = new ArrayReaderImpl();

    public static void main(String[] args) throws ArrayException {
        List<int[]> array = arrayReader.readArray("data//arrays.txt");

        for (int i = 0; i < array.size(); i++) {
            System.out.println(Arrays.toString(array.get(i)));
        }
    }
}
