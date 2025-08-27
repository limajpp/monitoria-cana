package utils.printing;

public class Printer {
    public static void printArray(int[] array) {
        StringBuilder arrayString = new StringBuilder("Array - [");

        int lastNumber = array[array.length - 1];
        for (int currentNumber : array) {
            if (currentNumber == lastNumber) {
                arrayString.append(currentNumber).append("];");
                break;
            }
            arrayString.append(currentNumber).append(", ");
        }

        System.out.println(arrayString);
    }

    public static void linebreak() {
        System.out.println("-------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------");
    }
}
