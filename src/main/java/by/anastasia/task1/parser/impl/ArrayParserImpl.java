package by.anastasia.task1.parser.impl;

import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.parser.ArrayParser;
import by.anastasia.task1.validator.StringArrayValidator;
import by.anastasia.task1.validator.impl.StringArrayValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayParserImpl implements ArrayParser {
    private static final String COMMA_SPACE_DELIMITER = ",\\s+";

    static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int[] parseStringToInt(String str) throws ArrayException {
        if (str.isBlank()) {
            LOGGER.log(Level.ERROR, "The string is empty");
            throw new ArrayException("The string is empty");
        }

        String[] strArray = str.split(COMMA_SPACE_DELIMITER);
        int[] tempArray = new int[strArray.length];

        StringArrayValidator validator = new StringArrayValidatorImpl();
        int counter = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (validator.stringNumberValidate(strArray[i])) {
                tempArray[counter] = Integer.parseInt(strArray[i]);
                counter++;
            }
        }
        int[] resultArray = Arrays.copyOf(tempArray, counter);
        return resultArray;
    }
}
