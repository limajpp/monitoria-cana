package algorithms.searching.binary;

import utils.generating.Generator;
import utils.printing.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Generator.generateNoDuplicatesRandomArray(10, 0, 100);
        Printer.printArray(array);

        Printer.linebreak();
        System.out.print("Insira o número para ver sua posição: ");

        int index = search(array, sc.nextInt());
        // int index = recursiveSearch(array, sc.nextInt());
        if (index == -1) {
            System.out.println("O número não está presente no array.");
        } else {
            System.out.printf("O número está na posição: %d%n", index);
        }
    }

    private static int search(int[] array, int number) { return search(array, 0, array.length, number); }
    private static int search(int[] array, int firstIndex, int lastIndex, int number) {
        while (firstIndex <= lastIndex) {
            int middle = (firstIndex + lastIndex) / 2;

            if (array[middle] == number) {
                return middle;
            } else if (array[middle] > number) {
                lastIndex = middle - 1;
            } else {
                firstIndex = middle + 1;
            }
        }
        return -1;
    }

    private static int recursiveSearch(int[] array, int number) { return recursiveSearch(array, 0, array.length, number); }
    private static int recursiveSearch(int[] array, int firstIndex, int lastIndex, int number) {
        if (lastIndex >= firstIndex) {
            int middle = firstIndex + (lastIndex - firstIndex) / 2;

            if (array[middle]== number) return middle;
            if (array[middle]> number) return recursiveSearch(array, firstIndex, middle - 1, number);
            return recursiveSearch(array, middle + 1, lastIndex, number);
        }
        return -1;
    }
}
