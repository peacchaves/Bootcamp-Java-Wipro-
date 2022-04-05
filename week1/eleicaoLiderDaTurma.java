package week1;

import java.util.Scanner;

public class eleicaoLiderDaTurma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o nome do primeiro candidato? ");
        String candidato1 = scan.next();

        System.out.print("Qual o nome do segundo candidato? ");
        String candidato2 = scan.next();

        System.out.print("Qual o nome do terceiro candidato? ");
        String candidato3 = scan.next();

        System.out.print("Qual o nome do quarto candidato? ");
        String candidato4 = scan.next();

        System.out.print("Quantos alunos vão votar? ");
        int qtdVotos = scan.nextInt();

        System.out.println("Hora de votar!"
                        +"\nPara votar no candidato(a) " + candidato1 + ", digite '1'."
                        +"\nPara votar no candidato(a) " + candidato2 + ", digite '2'."
                        +"\nPara votar no candidato(a) " + candidato3 + ", digite '3'."
                        +"\nPara votar no candidato(a) " + candidato4 + ", digite '4'.");


        int votos1 = 0;
        int votos2 = 0;
        int votos3 = 0;
        int votos4 = 0;

        for (int i = 0; i < qtdVotos; i++) {
            System.out.print("Escolha seu candidato(1, 2, 3 ou 4): ");
            int voto = scan.nextInt();


            switch (voto) {
                case 1:
                    votos1++;
                    break;
                case 2:
                    votos2++;
                    break;
                case 3:
                    votos3++;
                    break;
                case 4:
                    votos4++;
                    break;
            }
        }


        if (votos1 > votos2 && votos1 > votos3 && votos1 > votos4) {
            System.out.print(candidato1 + ": " + votos1 + " (VENCEDOR!!)\n"
                    + candidato2 + ": " + votos2 + "\n"
                    + candidato3 + ": " + votos3 + "\n"
                    + candidato4 + ": " + votos4);
        } else if (votos2 > votos1 && votos2 > votos3 && votos2 > votos4) {
            System.out.print(candidato1 + ": " + votos1 + "\n"
                    + candidato2 + ": " + votos2 + " (VENCEDOR!!)\n"
                    + candidato3 + ": " + votos3 + "\n"
                    + candidato4 + ": " + votos4);
        } else if (votos3 > votos1 && votos3 > votos2 && votos3 > votos4) {
            System.out.print(candidato1 + ": " + votos1 + "\n"
                    + candidato2 + ": " + votos2 + "\n"
                    + candidato3 + ": " + votos3 + "(VENCEDOR!!)\n"
                    + candidato4 + ": " + votos4);
        } else if (votos4 > votos1 && votos4 > votos2 && votos4 > votos3) {
            System.out.print(candidato1 + ": " + votos1 + "\n"
                    + candidato2 + ": " + votos2 + "\n"
                    + candidato3 + ": " + votos3 + "\n"
                    + candidato4 + ": " + votos4 + " (VENCEDOR!!)");
        } else {
            System.out.print(candidato1 + ": " + votos1 + "\n"
                    + candidato2 + ": " + votos2 + "\n"
                    + candidato3 + ": " + votos3 + "\n"
                    + candidato4 + ": " + votos4 + "\n"
                    + "***Empate ou erro***");

        }
    }
}
