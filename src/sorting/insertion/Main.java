package sorting.insertion;

import utils.generating.Generator;
import utils.printing.Printer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array antes da ordenação:");
        int[] array = Generator.generateNoDuplicatesRandomArray(5, 0, 100);
        Printer.printArray(array);

        Printer.linebreak();

        sort(array);
        System.out.println("Array depois da ordenação:");
        Printer.printArray(array);
    }

    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentNumber = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > currentNumber) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentNumber;
        }
    }
}
