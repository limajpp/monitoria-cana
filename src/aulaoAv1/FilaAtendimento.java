package aulaoAv1;
import java.util.Arrays;

public class FilaAtendimento {
    private final String[] filaDeAtendimento;

    public FilaAtendimento(String[] filaDeAtendimento) {
        this.filaDeAtendimento = filaDeAtendimento;
        Arrays.sort(this.filaDeAtendimento);
    }

    public static void main(String[] args) {
        String[] nomes = {"Talita", "Paula", "Pedro", "Fernando", "Carlos"};
        FilaAtendimento minhaFila = new FilaAtendimento(nomes);

        String proximoNome = minhaFila.proximoAtendimento();
        System.out.println("Próximo a ser atendido: " + proximoNome);
        minhaFila.exibirFila();

        int indice = minhaFila.buscarNome("Pedro");

        if (indice != -1) {
            System.out.println("O nome 'Pedro' foi encontrado no índice: " + indice);
        } else {
            System.out.println("O nome 'Pedro' não foi encontrado.");
        }

        minhaFila.combinarNomes();
    }

    private String proximoAtendimento() {
        return this.filaDeAtendimento[0];
    }

    private void exibirFila() {
        int i = 0;
        for (String nome : this.filaDeAtendimento) {
            System.out.println(i + ". " + nome + ";");
            i++;
        }
    }

    private int buscarNome(String nome) {
        int indiceAtualEsquerda = 0;
        int indiceAtualDireita = this.filaDeAtendimento.length - 1;

        while (indiceAtualEsquerda <= indiceAtualDireita) {
            int indiceAtualMeio = (indiceAtualEsquerda + indiceAtualDireita) / 2;
            String nomeDoMeio = filaDeAtendimento[indiceAtualMeio];

            int comparacao = nomeDoMeio.compareTo(nome);

            if (comparacao == 0) {
                return indiceAtualMeio;
            } else if (comparacao < 0) {
                indiceAtualEsquerda = indiceAtualMeio + 1;
            } else {
                indiceAtualDireita = indiceAtualMeio - 1;
            }
        }

        return -1;
    }

    private void combinarNomes() {
        int combinacao = 1;
        for (int i = 0; i < this.filaDeAtendimento.length; i++) {
            for (int j = 0; j < this.filaDeAtendimento.length; j++) {
                System.out.printf("%d: %s & %s%n", combinacao, this.filaDeAtendimento[i], this.filaDeAtendimento[j]);
                combinacao++;
            }
        }
    }

    private void metodo1() {
        for (int i = 0; i < this.filaDeAtendimento.length; i++) {
            System.out.println(this.filaDeAtendimento[i]);
        }

        for (int i = 0; i < this.filaDeAtendimento.length; i++) {
            System.out.println(this.filaDeAtendimento[i]);
        }
    }

    private void metodo2() {
        System.out.println("Primeiro da fila: " + this.filaDeAtendimento[0]);

        for (int i = 0; i < this.filaDeAtendimento.length; i++) {
            System.out.println(this.filaDeAtendimento[i]);
        }

        for (int i = 0; i < this.filaDeAtendimento.length; i++) {
            System.out.println(this.filaDeAtendimento[i]);
            for (int j = 0; j < this.filaDeAtendimento.length; j++) {
                System.out.println(j);
            }
        }
    }

    private static int teste(int n) {
        int total = n;
        System.out.println("*");

        for (int i = 2; i <= n; i++) {
            System.out.println("#");
            for (int j = 2; j <= n; j++) {
                System.out.println("!");
                total = total + j - i;
            }
        }

        System.out.println("*");
        return total;
    }
}
