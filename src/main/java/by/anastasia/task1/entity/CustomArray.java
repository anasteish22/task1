package by.anastasia.task1.entity;

import by.anastasia.task1.util.IdGenerator;

import java.util.Arrays;

public class CustomArray {
    private int[] array;
    private int arrayId;

    public CustomArray(int[] currentArray) {
        this.array = Arrays.copyOf(currentArray, currentArray.length);
        this.arrayId = IdGenerator.createId();
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int[] currentArray) {
        this.array = Arrays.copyOf(currentArray, currentArray.length);
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

    public int getElement(int index) {
        return array[index];
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
