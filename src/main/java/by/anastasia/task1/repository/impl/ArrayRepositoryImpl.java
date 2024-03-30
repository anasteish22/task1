package by.anastasia.task1.repository.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.repository.ArrayRepository;
import by.anastasia.task1.repository.specification.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayRepositoryImpl implements ArrayRepository {
    private List<CustomArray> customArrays;

    public ArrayRepositoryImpl(List<CustomArray> customArrays) {
        this.customArrays = new ArrayList<>();
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
    public List<CustomArray> querySpecification(Specification specification) {
        List<CustomArray> results = customArrays.stream()
                .filter(array -> specification.specify(array))
                .toList();
        return results;
    }

    @Override
    public List<CustomArray> queryPredicate(Predicate<CustomArray> predicate) {
        List<CustomArray> results = customArrays.stream()
                .filter(predicate)
                .toList();
        return results;
    }
}
