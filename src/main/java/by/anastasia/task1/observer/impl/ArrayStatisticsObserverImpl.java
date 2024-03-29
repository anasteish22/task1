package by.anastasia.task1.observer.impl;

import by.anastasia.task1.entity.ArrayStatistics;
import by.anastasia.task1.entity.ArrayWarehouse;
import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.observer.ArrayStatisticsObserver;

public class ArrayStatisticsObserverImpl implements ArrayStatisticsObserver {
    @Override
    public void changeArrayElement(CustomArray array) throws ArrayException {
        ArrayStatistics statistics = new ArrayStatistics(array);
        int id = array.getArrayId();
        ArrayWarehouse warehouse = ArrayWarehouse.getInstance();
        warehouse.put(id, statistics);
    }
}
