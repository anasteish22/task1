package by.anastasia.task1.parser.impl;

import by.anastasia.task1.parser.ArrayParser;
import by.anastasia.task1.validator.StringArrayValidator;
import by.anastasia.task1.validator.impl.StringArrayValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayParserImpl implements ArrayParser {
    static final Logger LOGGER = LogManager.getLogger();
    private static final String COMMA_SPACE_DELIMITER = ",\\s+";

    @Override
    public List<int[]> parseStringToInt(List<String> strings) {
        List<int[]> arrayList = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);

            if (str.isBlank()) {
                LOGGER.log(Level.ERROR, "The string is empty");
                continue;
            }

            String[] strArray = str.split(COMMA_SPACE_DELIMITER);
            int[] tempArray = new int[strArray.length];

            StringArrayValidator validator = new StringArrayValidatorImpl();
            int counter = 0;

            for (int j = 0; j < strArray.length; j++) {
                if (validator.stringNumberValidate(strArray[j])) {
                    tempArray[counter] = Integer.parseInt(strArray[j]);
                    counter++;
                }
            }

            int[] resultArray = Arrays.copyOf(tempArray, counter);

            if (resultArray.length == 0) {
                LOGGER.log(Level.ERROR, "The array is empty");
                continue;
            }

            arrayList.add(resultArray);
        }
        return arrayList;
    }
}
