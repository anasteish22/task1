package by.anastasia.task1.creator;

import by.anastasia.task1.entity.CustomArray;
import by.anastasia.task1.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayFactory {
    static final Logger LOGGER = LogManager.getLogger();

    public static CustomArray createCustomArray(int[] array) throws ArrayException {
        if (array == null) {
            LOGGER.log(Level.ERROR, "The array is null");
            throw new ArrayException("The array is null");
        }

        CustomArray customArray = new CustomArray(array);
        return customArray;
    }
}
