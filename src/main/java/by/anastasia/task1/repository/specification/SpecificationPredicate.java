package by.anastasia.task1.repository.specification;

import by.anastasia.task1.entity.CustomArray;

import java.util.function.Predicate;

public interface SpecificationPredicate extends Predicate<CustomArray> {
    @Override
    boolean test(CustomArray array);
}
