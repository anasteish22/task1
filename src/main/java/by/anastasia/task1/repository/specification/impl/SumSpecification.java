package by.anastasia.task1.repository.specification.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.repository.specification.Specification;
import by.anastasia.task1.service.ArrayService;
import by.anastasia.task1.service.impl.ArrayServiceImpl;

public class SumSpecification implements Specification {
    private int maxSum;

    public SumSpecification(int maxSum) {
        this.maxSum = maxSum;
    }

    @Override
    public boolean specify(CustomArray array) throws ArrayException {
        ArrayService service = new ArrayServiceImpl();
        int currentSum = service.calculateSum(array);
        return currentSum <= maxSum;
    }
}