import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random numeroAleatorio = new Random();

        // Variaveis

        int opcao;
        int escolhaComputador;
        int escolhaUsuario;
        String nome;

        //O Jogo//

        System.out.println("\n================ ADVINHE O NÚMERO ================\n");
        System.out.println("Olá, Qual o seu nome? ");
        nome = teclado.nextLine();
        System.out.println("Prazer em conheçe-lo(a), " + nome + "!");

        System.out.println(nome + ", você deseja iniciar o jogo?");
        System.out.println("\nInforme a sua opção: ");
        System.out.println("\n1 -> Sim");
        System.out.println("\n2 -> Não");
        opcao = teclado.nextInt();

        if (opcao == 2){
            System.out.println("Poxa, que Pena! Deixa para outra hora. ");
        } else if (opcao == 1){
            System.out.println("Eba! Vou lhe informa como funciona o Jogo.");
            System.out.println("Eu irei gerar um numero de 0 até 10 e você tem que advinhar qual é, tudo bem?");
            System.out.println("Vamos lá, estou escolhando um numero..... ");
            escolhaComputador = numeroAleatorio.nextInt(11);

            System.out.println("Opa " + nome + ", já escolhi meu número, agora você tentará advinhar ele. ");
            System.out.println("Em 3...2...1... Valendo!");

            do {
                escolhaUsuario = teclado.nextInt();
                if (escolhaUsuario != escolhaComputador){
                    System.out.println("Resposta errada, tente novamente!");
                } else{
                    System.out.println("======PARABÉNS, " + nome + " VOCÊ ACERTOU! ======");
                    System.out.println("\n================ OBRIGADO POR JOGAR! ================\n");
                }
            } while (escolhaComputador != escolhaUsuario);
        }
    }
}