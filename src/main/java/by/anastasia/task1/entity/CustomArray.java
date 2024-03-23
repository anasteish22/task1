package by.anastasia.task1.entity;

public class CustomArray {
    private int[] array;

    public CustomArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int length() {
        return array.length;
    }

    public int getElement(int index) {
        return array[index];
    }
}
