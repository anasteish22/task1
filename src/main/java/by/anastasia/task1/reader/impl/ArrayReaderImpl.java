package by.anastasia.task1.reader.impl;

import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.parser.ArrayParser;
import by.anastasia.task1.parser.impl.ArrayParserImpl;
import by.anastasia.task1.reader.ArrayReader;
import by.anastasia.task1.validator.StringArrayValidator;
import by.anastasia.task1.validator.impl.StringArrayValidatorImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ArrayReaderImpl implements ArrayReader {
    static final Logger LOGGER = LogManager.getLogger();
    private static final String SPACE_DELIMITER = ",\\s+";

    @Override
    public int[] readArray(String filename) throws ArrayException {
        Path path = Path.of(filename);

        if (!Files.exists(path)) {
            LOGGER.log(Level.ERROR, "File " + filename + " doesn't exist");
            throw new ArrayException("File " + filename + " doesn't exist");
        }

        LOGGER.log(Level.INFO, "File " + filename + " was found");

        BufferedReader reader = null;
        ArrayParser parser;
        int[] resultArray = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            parser = new ArrayParserImpl();
            String temp;

            if ((temp = reader.readLine()) != null) {
                resultArray = parser.parseStringToInt(temp);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        LOGGER.log(Level.INFO, "File " + filename + " was successfully read");
        return resultArray;
    }
}
