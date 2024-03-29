package by.anastasia.task1.entity;

import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.observer.ArrayStatisticsObserver;
import by.anastasia.task1.observer.impl.ArrayStatisticsObserverImpl;
import by.anastasia.task1.util.IdGenerator;

import java.util.Arrays;

public class CustomArray {
    private int[] array;
    private int arrayId;
    private ArrayStatisticsObserver statisticsObserver;

    public CustomArray(int[] currentArray) {
        this.array = Arrays.copyOf(currentArray, currentArray.length);
        this.arrayId = IdGenerator.createId();
        this.statisticsObserver = new ArrayStatisticsObserverImpl();
    }

    public void addObserver() {
        statisticsObserver = new ArrayStatisticsObserverImpl();
    }

    public void removeObserver() {
        statisticsObserver = null;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] currentArray) throws ArrayException {
        this.array = Arrays.copyOf(currentArray, currentArray.length);
        notifyObserver();
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }

    public int length() {
        return array.length;
    }

    public void setElement(int index, int value) throws ArrayException {
        array[index] = value;
        notifyObserver();
    }
    public int getElement(int index) {
        return array[index];
    }

    private void notifyObserver() throws ArrayException {
        if (statisticsObserver != null) {
            statisticsObserver.changeArrayElement(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
