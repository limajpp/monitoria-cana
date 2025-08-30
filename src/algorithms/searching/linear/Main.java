package algorithms.searching.linear;

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
        if (index == -1) {
            System.out.println("O número não está presente no array.");
        } else {
            System.out.printf("O número está na posição: %d%n", index);
        }
    }

    private static int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return i;
        }
        return -1;
    }
}
