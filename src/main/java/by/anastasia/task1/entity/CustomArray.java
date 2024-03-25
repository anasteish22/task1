package by.anastasia.task1.entity;

import java.util.Arrays;

public class CustomArray {
    private int[] array;
    private int arrayId;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray(int[] array, int arrayId) {
        this.array = array;
        this.arrayId = arrayId;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
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
