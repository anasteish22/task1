package by.anastasia.task1.repository.specification;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;

public interface Specification {
    boolean specify(CustomArray array) throws ArrayException;
}
