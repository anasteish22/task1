package by.anastasia.task1.repository.specification.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.repository.specification.SpecificationPredicate;
import by.anastasia.task1.service.ArrayService;
import by.anastasia.task1.service.impl.ArrayServiceImpl;

public class MaxSpecificationPredicate implements SpecificationPredicate {
    private int maxRangeMax;
    private int minRangeMax;

    public MaxSpecificationPredicate(int maxRangeMax, int minRangeMax) {
        this.maxRangeMax = maxRangeMax;
        this.minRangeMax = minRangeMax;
    }

    @Override
    public boolean test(CustomArray array) {
        ArrayService service = new ArrayServiceImpl();
        int currentMax = service.findMax(array);
        return (maxRangeMax >= currentMax && minRangeMax <= currentMax);
    }
}
