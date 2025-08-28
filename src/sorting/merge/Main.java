package sorting.merge;

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
        if (array.length <= 1) {
            return;
        }

        int middleIndex = array.length / 2;
        int[] leftPartition = new int[middleIndex], rightPartition = new int[array.length - middleIndex];

        System.arraycopy(array, 0, leftPartition, 0, middleIndex);
        System.arraycopy(array, middleIndex, rightPartition, 0, array.length - middleIndex);

        sort(leftPartition);
        sort(rightPartition);
        merge(array, leftPartition, rightPartition);
    }

    private static void merge(int[] originalArray, int[] leftPartition, int[] rightPartition) {
        int i = 0, j = 0, k = 0;

        while (i < leftPartition.length && j < rightPartition.length) {
            if (leftPartition[i] <= rightPartition[j]) {
                originalArray[k] = leftPartition[i];
                i++;
            } else {
                originalArray[k] = rightPartition[j];
                j++;
            }
            k++;
        }

        while (i < leftPartition.length) {
            originalArray[k] = leftPartition[i];
            i++;
            k++;
        }

        while (j < rightPartition.length) {
            originalArray[k] = rightPartition[j];
            j++;
            k++;
        }
    }
}
