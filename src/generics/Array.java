package generics;


public class Array {

    public static <T extends Comparable<T>> T getMaxElement(T[] elements) {
        T maxElement = elements[0];
        for (T element : elements) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {

        Integer[] newIntArray = {1,2,5,4,54,112,3};
        Double[] newDoubleArray = {0.4,0.1,6.22,112.44};

        System.out.println("printing max value from array");
        System.out.println(getMaxElement(newIntArray));

        System.out.println("printing max value from array");
        System.out.println(getMaxElement(newDoubleArray));

    }
}
