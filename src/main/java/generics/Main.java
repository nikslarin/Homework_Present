package generics;


import java.util.*;

public class Main {
    private static <E> void printArray(E[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        Integer[] newIntArray = {1,2,3};
        String[] newStringArray = {"abc", "def", "zxy"};
        Double[] newDoubleArray = {0.4,0.1,6.22};

        System.out.println("printing int array");
        printArray(newIntArray);

        System.out.println("printing String array");
        printArray(newStringArray);

        System.out.println("printing Double array");
        printArray(newDoubleArray);

    }

}
