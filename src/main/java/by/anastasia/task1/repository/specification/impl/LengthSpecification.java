package by.anastasia.task1.repository.specification.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.repository.specification.Specification;

public class LengthSpecification implements Specification {
    private int minLength;

    public LengthSpecification(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean specify(CustomArray array) throws ArrayException {
        int currentLength = array.length();
        return currentLength > minLength;
    }
}
