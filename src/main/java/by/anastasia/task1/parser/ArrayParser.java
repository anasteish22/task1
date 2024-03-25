package by.anastasia.task1.parser;

import by.anastasia.task1.exception.ArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface ArrayParser {
    public int[] parseStringToInt(String str) throws ArrayException;
}
