package by.anastasia.task1.repository.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.repository.ArrayRepository;
import by.anastasia.task1.repository.specification.Specification;

import java.util.ArrayList;
import java.util.List;

public class ArrayRepositoryImpl implements ArrayRepository {
    private List<CustomArray> customArrays;

    public ArrayRepositoryImpl(List<CustomArray> customArrays) {
        this.customArrays = new ArrayList<>();
    }

    public List<CustomArray> getCustomArrays() {
        return customArrays;
    }

    @Override
    public void setCustomArrays(List<CustomArray> customArrays) {
        this.customArrays = customArrays;
    }

    @Override
    public boolean add(CustomArray array) {
        return customArrays.add(array);
    }

    @Override
    public boolean remove(CustomArray array) {
        return customArrays.remove(array);
    }

    @Override
    public List<CustomArray> query(Specification specification) throws ArrayException {
        List<CustomArray> results = new ArrayList<>();

        for (CustomArray array: customArrays) {
            if (specification.specify(array)) {
                results.add(array);
            }
        }
        return results;
    }
}
