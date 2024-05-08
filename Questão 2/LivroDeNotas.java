import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroDeNotas {
    private int numeroAlunos;
    private List<Double> medias;

    public LivroDeNotas() {
        medias = new ArrayList<>();
    }

    public void calcularMediaDeCadaAluno() {
        Scanner scanner = new Scanner(System.in);

        // Capturar o número de alunos
        System.out.print("Digite o número de alunos: ");
        numeroAlunos = scanner.nextInt();

        // Capturar as notas e calcular a média de cada aluno
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Digite a nota da A1: ");
            double a1 = scanner.nextDouble();
            System.out.print("Digite a nota da A2: ");
            double a2 = scanner.nextDouble();
            System.out.print("Digite a nota da A3: ");
            double a3 = scanner.nextDouble();

            // Calcular a média do aluno conforme critérios da São Judas
            double media = (a1 + a2 + (2 * a3)) / 4;

            // Armazenar a média do aluno na lista
            medias.add(media);

            // Exibir a média do aluno
            System.out.println("Média do aluno " + (i + 1) + ": " + media);
        }

        scanner.close();
    }

    public void calcularMediaDaTurma() {
        // Verificar se o método calcularMediaDeCadaAluno já foi chamado
        if (numeroAlunos == 0) {
            System.out.println("Erro: Número de alunos não definido. Execute calcularMediaDeCadaAluno primeiro.");
            return;
        }

        double somaMedias = 0.0;

        // Somar as médias de todos os alunos
        for (double media : medias) {
            somaMedias += media;
        }

        // Calcular a média da turma
        double mediaTurma = somaMedias / numeroAlunos;

        // Exibir a média da turma
        System.out.println("Média geral da turma: " + mediaTurma);
    }
}

    