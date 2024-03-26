package by.anastasia.task1.reader.impl;

import by.anastasia.task1.exception.ArrayException;
import by.anastasia.task1.parser.ArrayParser;
import by.anastasia.task1.parser.impl.ArrayParserImpl;
import by.anastasia.task1.reader.ArrayReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader {
    static final Logger LOGGER = LogManager.getLogger();

    @Override
    public List<int[]> readArray(String filename) throws ArrayException {
        if (filename == null) {
            LOGGER.log(Level.ERROR, "File " + filename + " is null");
            throw new ArrayException("File " + filename + " is null");
        }

        File file = new File(filename);

        if (!file.exists()) {
            LOGGER.log(Level.ERROR, "File " + filename + " doesn't exist");
            throw new ArrayException("File " + filename + " doesn't exist");
        }

        if (file.length() == 0) {
            LOGGER.log(Level.ERROR, "File " + filename + " is empty");
            throw new ArrayException("File " + filename + " is empty");
        }

        LOGGER.log(Level.INFO, "File " + filename + " was found");

        BufferedReader reader = null;
        ArrayParser parser = new ArrayParserImpl();
        List<int[]> parsedList;

        try {
            reader = new BufferedReader(new FileReader(filename));
            List<String> strings = new ArrayList<>();
            String temp;

            while ((temp = reader.readLine()) != null) {
                strings.add(temp);
            }

            parsedList = parser.parseStringToInt(strings);

        } catch (IOException e) {
            LOGGER.log(Level.ERROR, "File " + filename + " doesn't have any valid array");
            throw new ArrayException("File " + filename + " doesn't have any valid array");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    LOGGER.log(Level.ERROR, "Couldn't close the reader");
                    throw new ArrayException("Couldn't close the reader");
                }
            }
        }

        LOGGER.log(Level.INFO, "File " + filename + " was successfully read");
        return parsedList;
    }
}
