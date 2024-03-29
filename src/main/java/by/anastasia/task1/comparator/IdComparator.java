package by.anastasia.task1.comparator;

import by.anastasia.task1.entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray>{
    @Override
    public int compare(CustomArray array1, CustomArray array2) {
        return array1.getArrayId() - array2.getArrayId();
    }
}
