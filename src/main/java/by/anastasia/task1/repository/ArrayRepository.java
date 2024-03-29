package by.anastasia.task1.repository;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.repository.specification.Specification;

import java.util.List;

public interface ArrayRepository {
    boolean add(CustomArray array);
    boolean remove(CustomArray array);
    List<CustomArray> query (Specification specification) throws ArrayException;
}
