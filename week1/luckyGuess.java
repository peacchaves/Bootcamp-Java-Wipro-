package week1;

import java.util.Random;
import java.util.Scanner;

public class luckyGuess {
    public static void main(String[] args) {

        Random random = new Random();
        int numRandom = random.nextInt(11);
        Scanner scan = new Scanner(System.in);

        System.out.println("Tente descobrir o número escolhido(0 a 10): ");
        int valor = scan.nextInt();


        int countTry = 1;
        while (numRandom != valor) {
            if (numRandom < valor) {
                System.out.println("Não é esse! Mas vou te dar uma dica, o número é MENOR do que você escolheu");
                System.out.println("Tente novamente: ");
                valor = scan.nextInt();
            } else {
                System.out.println("Não é esse! Mas vou te dar uma dica, o número é MAIOR do que você escolheu");
                System.out.println("Tente novamente: ");
                valor = scan.nextInt();
            }
            countTry++;
        }
        System.out.println("Como você conseguiu acertar!?! Parabéns!!");
        System.out.println("Total de tentativas: " + countTry);
        scan.close();
    }
}
