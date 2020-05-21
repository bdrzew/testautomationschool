package Szymon_zadanie10.testData;

import java.util.Arrays;
import java.util.List;

public class CategoriesLists {
    private static List<String> mainCategories = Arrays.asList("WOMEN", "DRESSES", "T-SHIRTS");
    private static List<String> dressesCategories = Arrays.asList("CASUAL DRESSES", "EVENING DRESSES", "SUMMER DRESSES");

    public static List<String> getDressesCategories() {
        return dressesCategories;
    }

    public static List<String> getMainCategories() {
        return mainCategories;
    }
}
