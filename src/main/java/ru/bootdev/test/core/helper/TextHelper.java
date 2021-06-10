package ru.bootdev.test.core.helper;

import java.util.Random;

public class TextHelper {

    public static String generateId() {
        return String.valueOf(System.nanoTime());
    }

    public static String generateRandomId(int length, int randomNumberOrigin, int randomNumberBound) {
        if (length <= 0) return "";
        StringBuilder buffer = new StringBuilder();
        new Random(System.nanoTime()).ints(length, randomNumberOrigin, randomNumberBound)
                .forEach(i -> buffer.append(buffer.length() == 0 ? 1 : i));
        return buffer.toString();
    }

    public static String generateRandomId(int length) {
        return generateRandomId(length, 0, 9);
    }

    public static Integer randomInt(int randomNumberOrigin, int randomNumberBound) {
        return new Random(System.nanoTime()).ints(randomNumberOrigin, randomNumberBound).findFirst().getAsInt();
    }

    public static Long randomLong(long randomNumberOrigin, long randomNumberBound) {
        return new Random(System.nanoTime()).longs(randomNumberOrigin, randomNumberBound).findFirst().getAsLong();
    }

    public static Double randomDouble(double randomNumberOrigin, double randomNumberBound) {
        return new Random(System.nanoTime()).doubles(randomNumberOrigin, randomNumberBound).findFirst().getAsDouble();
    }

    public static String stringToFileName(String str) {
        return str.replaceAll("[|\\\\/?:*\"><]", "-").replace(" ", "_");
    }
}
