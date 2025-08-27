package utils.generating;

import java.util.Random;

public class Generator {
    private static final Random random = new Random();

    /**
     * Gera um array de inteiros com um tamanho específico, preenchido com números
     * aleatórios e únicos dentro de um intervalo definido, usando apenas arrays padrão.
     *
     * @param length      O tamanho do array a ser gerado.
     * @param lowerBound  O limite inferior (inclusivo) do intervalo.
     * @param higherBound O limite superior (exclusivo) do intervalo.
     * @return Um array de inteiros com números aleatórios e sem duplicatas.
     * @throws IllegalArgumentException Se o tamanho (length) for maior que o número de
     * valores únicos possíveis no intervalo.
     */
    public static int[] generateNoDuplicatesRandomArray(int length, int lowerBound, int higherBound) {
        int rangeSize = higherBound - lowerBound;
        if (length > rangeSize) {
            throw new IllegalArgumentException(
                    "O tamanho do array solicitado (" + length +
                            ") é maior que o número de inteiros únicos no intervalo."
            );
        }

        int[] resultArray = new int[length];
        int count = 0; // Contador de quantos números únicos já foram adicionados.

        while (count < length) {
            int candidateNumber = random.nextInt(lowerBound, higherBound);
            if (!contains(resultArray, count, candidateNumber)) {
                resultArray[count] = candidateNumber;
                count++;
            }
        }

        return resultArray;
    }

    /**
     * Método auxiliar privado para verificar se um valor já existe no array.
     *
     * @param array         O array onde a busca será feita.
     * @param currentLength O número de elementos já preenchidos no array.
     * @param value         O valor a ser procurado.
     * @return 'true' se o valor for encontrado, 'false' caso contrário.
     */
    private static boolean contains(int[] array, int currentLength, int value) {
        for (int i = 0; i < currentLength; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}