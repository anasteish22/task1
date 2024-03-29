package by.anastasia.task1.validator.impl;

import by.anastasia.task1.validator.StringArrayValidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringArrayValidatorImpl implements StringArrayValidator {
    private static final String INT_NUMBER_REGEX = "[-+]?\\d{1,2}";
    private static final String INT_ARRAY_REGEX = "(\\d{1,2}\\s+)+(\\d{1,2})";

    @Override
    public boolean stringNumberValidate(String strNumber) {
        Pattern pattern = Pattern.compile(INT_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(strNumber);
        return matcher.matches();
    }

    @Override
    public boolean stringArrayValidate(String strArray) {
        Pattern pattern = Pattern.compile(INT_ARRAY_REGEX);
        Matcher matcher = pattern.matcher(strArray);
        return matcher.matches();
    }
}
