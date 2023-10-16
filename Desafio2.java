import java.util.Random;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        System.out.println("Jogo de Adivinhação");
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        Random gerador = new Random();
        int numeroAleatorio = new Random().nextInt(100);

        while (tentativas < 5) {
            System.out.println("Escolha um número entre 0 e 100:");
            int numeroUsuario = scanner.nextInt();
            tentativas++;
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Você acertou ! ");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("Você chutou baixo!");
            } else{
                System.out.println("Você chutou alto!");
            }
        }
        if (tentativas == 5){
            System.out.println("Você perdeu! Chances esgotadas.");
        }
    }
}
