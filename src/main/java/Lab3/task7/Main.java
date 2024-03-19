package Lab3.task7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        UniqueList<String> uniqueList = new UniqueList<>();

        uniqueList.add("apple");
        uniqueList.add("banana");
        uniqueList.add("apple");
        uniqueList.addAll(Arrays.asList("orange", "banana", "grape"));

        System.out.println("UniqueList: " + uniqueList);
    }
}
