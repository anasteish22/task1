package by.anastasia.task1.repository.specification.impl;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.repository.specification.SpecificationPredicate;
import by.anastasia.task1.service.ArrayService;
import by.anastasia.task1.service.impl.ArrayServiceImpl;

public class MinSpecificationPredicate implements SpecificationPredicate {
    private int maxRangeMin;

    public MinSpecificationPredicate(int maxRangeMin) {
        this.maxRangeMin = maxRangeMin;
    }

    @Override
    public boolean test(CustomArray array) {
        ArrayService service = new ArrayServiceImpl();
        int currentMin = service.findMin(array);
        return maxRangeMin > currentMin;
    }
}
