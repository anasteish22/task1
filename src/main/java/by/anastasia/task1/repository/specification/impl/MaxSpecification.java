package by.anastasia.task1.repository.specification.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.repository.specification.Specification;
import by.anastasia.task1.service.ArrayService;
import by.anastasia.task1.service.impl.ArrayServiceImpl;

public class MaxSpecification implements Specification {
    private int maxRangeMax;
    private int minRangeMax;

    public MaxSpecification(int maxRangeMax, int minRangeMax) {
        this.maxRangeMax = maxRangeMax;
        this.minRangeMax = minRangeMax;
    }

    @Override
    public boolean specify(CustomArray array) throws ArrayException {
        ArrayService service = new ArrayServiceImpl();
        int currentMax = service.findMax(array);
        return (maxRangeMax >= currentMax && minRangeMax <= currentMax);
    }
}
