package by.anastasia.task1.repository.specification.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.repository.specification.Specification;
import by.anastasia.task1.service.ArrayService;
import by.anastasia.task1.service.impl.ArrayServiceImpl;

public class NegativeNumSpecification implements Specification {
    private int minNegativeCount;

    public NegativeNumSpecification(int minNegativeCount) {
        this.minNegativeCount = minNegativeCount;
    }

    @Override
    public boolean specify(CustomArray array) throws ArrayException {
        ArrayService service = new ArrayServiceImpl();
        int currentNeg = service.countNegative(array);
        return currentNeg > 1;
    }
}
