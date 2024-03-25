package by.anastasia.task1.repository;

import by.anastasia.task1.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepository {
    private List<CustomArray> customArrays;

    public ArrayRepository(List<CustomArray> customArrays) {
        this.customArrays = new ArrayList<>();
    }

    public List<CustomArray> getCustomArrays() {
        return customArrays;
    }

    public void setCustomArrays(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
    }

    public boolean add(CustomArray array) {
        return customArrays.add(array);
    }

    public boolean remove(CustomArray array) {
        return customArrays.remove(array);
    }
}
