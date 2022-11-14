package by.by.HomeWork3;

public class Checker {
    public static int CheckData(String data, int trueItemsCount) {
        return data.split("\\s+").length - trueItemsCount;
    }
}
