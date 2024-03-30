package by.anastasia.task1.entity;

import by.anastasia.task1.service.ArrayService;
import by.anastasia.task1.service.impl.ArrayServiceImpl;

public class ArrayStatistics {
    ArrayService service = new ArrayServiceImpl();
    private int sum;
    private double average;
    private int min;
    private int max;

    public ArrayStatistics(CustomArray array) {
        this.sum = service.calculateSum(array);
        this.average = service.calculateAverage(array);
        this.min = service.findMin(array);
        this.max = service.findMax(array);
    }
}
