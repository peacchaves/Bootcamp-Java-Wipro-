package week1;

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Olá Aluno! Digite seu nome: ");
        String nomeAluno = scan.next();

        float nota1, nota2, media;
        int i;

        for (i = 0; i <2; i++) {
            System.out.print("Qual foi sua primeira nota? ");
            nota1 = scan.nextFloat();

            System.out.print("Qual foi sua segunda nota? ");
            nota2 = scan.nextFloat();

            media = (nota1 + nota2) / 2;

            i++;

            if (media >= 6) {
                System.out.println("Parabéns pela aprovação " +nomeAluno +"! Você conseguiu uma média de: " +media);
            } else
                System.out.println(nomeAluno +", infelizmente você não alcançou a aprovação, sua média foi de: " +media);
        }
    }
}
