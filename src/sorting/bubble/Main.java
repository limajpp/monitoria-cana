package sorting.bubble;

import utils.generating.Generator;
import utils.printing.Printer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array antes da ordenação:");
        int[] array = Generator.generateNoDuplicatesRandomArray(10, 0, 100);
        Printer.printArray(array);

        Printer.linebreak();

        sort(array);
        System.out.println("Array depois da ordenação:");
        Printer.printArray(array);
    }

    private static void sort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    private static void swap(int[] array, int firstNumberIndex, int secondNumberIndex) {
        int aux = array[firstNumberIndex];
        array[firstNumberIndex] = array[secondNumberIndex];
        array[secondNumberIndex] = aux;
    }
}
