package aulaoAv1;

import utils.printing.Printer;

import java.util.Scanner;

public class AlgoritmosIterativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MÉTODO 1 ---");
        System.out.print("Digite um tamanho de entrada: ");

        int[] custosMetodo1 = metodo1(sc.nextInt());
        exibirCustos(custosMetodo1);

        Printer.linebreak();

        System.out.println("--- MÉTODO 2 ---");

        int[] custosMetodo2 = metodo2(new int[] {1, 2, 3, 4, 5}, 4);
        exibirCustos(custosMetodo2);

        Printer.linebreak();

        System.out.println("--- MÉTODO 3 ---");

        int[] custosMetodo3 = metodo3(5);
        exibirCustos(custosMetodo3);

        Printer.linebreak();

        System.out.println("--- MÉTODO 4 ---");

        int[] custosMetodo4 = metodo4(5);
        exibirCustos(custosMetodo4);
    }

    private static void exibirCustos(int[] custos) {
        int qtdCustos = custos.length;
        StringBuilder stringBuilder = new StringBuilder("Custos ");

        for (int i = 0; i < qtdCustos; i++) {
            if (i == qtdCustos - 1) {
                stringBuilder.append("e ").append("C").append(i+1).append(", ");
                break;
            }

            if (i == qtdCustos - 2) {
                stringBuilder.append("C").append(i+1).append(" ");
                continue;
            }

            stringBuilder.append("C").append(i+1).append(", ");
        }

        stringBuilder.append("respectivamente:");
        System.out.println(stringBuilder);
        Printer.printArray(custos);
    }

    private static int[] metodo1(int n) {
        int C1 = 0, C2 = 0, C3 = 0;

        C1++;
        for (int i = 1; i < n; i++) {  // C1
            C1++;
            C2++;
            for (int j = 1; j < 800; j++) {  // C2
                C2++;
                // System.out.println(i + j); // C3
                C3++;
            }
        }

        return new int[] {C1, C2, C3};
    }

    private static int[] metodo2(int[] A, int n) {
        int C1 = 0, C2 = 0, C3 = 0, C4 = 0, C5 = 0;

        C1++;
        for (int i = 1; i <= n; i++) {  // C1
            C1++;
            C2++;
            for (int j = 1; j <= n; j++) {  // C2
                C2++;
                A[i] = A[i] + A[j];  // C3
                C3++;
            }
        }

        C4++;
        for (int k = 2; k <= n; k++) {  // C4
            C4++;
            A[k] = A[k - 1];  // C5
            C5++;
        }

        return new int[] {C1, C2, C3, C4, C5};
    }

    private static int[] metodo3(int n) {
        int C1 = 0, C2 = 0, C3 = 0, C4 = 0, C5 = 0;

        int valor = 0;  // C1
        C1++;

        C2++;
        for (int i = 1; i <= n; i++) {  // C2
            C2++;
            C3++;
            for (int j = 1; j <= n; j++) {  // C3
                C3++;
                C4++;
                for (int k = 1; k <= n; k++) {  // C4
                    C4++;
                    valor += 1;  // C5
                    C5++;
                }
            }
        }

        return new int[] {C1, C2, C3, C4, C5};
    }

    private static int[] metodo4(int n) {
        int C1 = 0, C2 = 0, C3 = 0;

        C1++;
        for (int i = 0; i <= n; i++) {  // C1
            C1++;
            C2++;
            for (int j = i; j <= n * n; j++) {  // C2
                C2++;
                // System.out.println("Hi!");  // C3
                C3++;
            }
        }

        return new int[] {C1, C2, C3};
    }
}
