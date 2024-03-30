package by.anastasia.task1.repository;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.repository.specification.Specification;

import java.util.List;
import java.util.function.Predicate;

public interface ArrayRepository {
    boolean add(CustomArray array);
    boolean remove(CustomArray array);
    List<CustomArray> querySpecification(Specification specification);
    List<CustomArray> queryPredicate(Predicate<CustomArray> predicate);
}
