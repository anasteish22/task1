package by.anastasia.task1.repository.specification.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.repository.specification.Specification;

public class IdSpecification implements Specification {
    private int minId;

    public IdSpecification(int minId) {
        this.minId = minId;
    }

    @Override
    public boolean specify(CustomArray array) {
        int currentId = array.getArrayId();
        return currentId > minId;
    }
}
