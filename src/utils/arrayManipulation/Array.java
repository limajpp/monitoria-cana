package utils.arrayManipulation;

public class Array {
    public static void swap(int[] array, int firstNumberIndex, int secondNumberIndex) {
        int aux = array[firstNumberIndex];
        array[firstNumberIndex] = array[secondNumberIndex];
        array[secondNumberIndex] = aux;
    }
}
