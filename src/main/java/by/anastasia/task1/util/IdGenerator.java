package by.anastasia.task1.util;

public class IdGenerator {
    private static final int FIRST_ID = 100_000_000;
    private static int currentId;

    public IdGenerator() {
        currentId = FIRST_ID;
    }

    public static int createId() {
        return currentId++;
    }
}
