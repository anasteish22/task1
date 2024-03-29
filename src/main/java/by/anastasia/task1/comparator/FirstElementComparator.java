package by.anastasia.task1.comparator;

import by.anastasia.task1.entity.CustomArray;

import java.util.Comparator;

public class FirstElementComparator implements Comparator<CustomArray> {
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return array2.getElement(0) - array1.getElement(0);
    }
}
