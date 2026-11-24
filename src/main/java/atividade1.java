import java.util.Scanner;

public class atividade1 {
    String nome;
    String matricula;
    double prova01;
    double prova02;
    double trabalho01;

    public atividade1(String nome, String matricula, double prova01, double prova02, double trabalho01) {
        this.nome = nome;
        this.matricula = matricula;
        this.prova01 = prova01;
        this.prova02 = prova02;
        this.trabalho01 = trabalho01;
    }
    public double media () {
        return (this.prova01*2.5+this.prova02*2.5+this.trabalho01*2)/10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaMinima = 6.0;

        System.out.println("   Cadastro de Notas do Aluno   ");

        System.out.println("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Informe a matrícula: ");
        String matricula = scanner.nextLine();

        System.out.println("Informe a nota da Prova 1: ");
        double prova01 = scanner.nextDouble();

        System.out.println("Informe a nota da prova 2: ");
        double prova02 = scanner.nextDouble();

        System.out.println("Informe a nota do trabalho 1: ");
        double trabalho01 = scanner.nextDouble();


        atividade1 aluno = new atividade1(nome, matricula, prova01, prova02, trabalho01);

        double mediaFinal = aluno.media();

        System.out.println("     Resultado    ");
        System.out.println("Aluno: " + aluno.nome);
        System.out.printf("Média Final: %.2f\n", mediaFinal);


        if (mediaFinal >= mediaMinima) {
            System.out.println("Parabéns! Você foi aprovado!");

        } else {
            double quantoFalta = mediaMinima - mediaFinal;
            System.out.printf("Você ficou abaixo da média. Faltaram %.2f pontos para atingir o mínimo de %.1f pontos.", quantoFalta, mediaMinima);
        }

        scanner.close();

    }
}
