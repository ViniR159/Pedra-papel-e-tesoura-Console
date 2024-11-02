import java.util.Random;
import java.util.Scanner;

public class Pedra_Papel_Tesoura_Console {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Pedra Papel Tesoura
        String[] opcoes = { "PEDRA", "PAPEL", "TESOURA" };
        int numeroDaEscolha = random.nextInt(opcoes.length);
        String escolhaMaquina = opcoes[numeroDaEscolha];

        System.out.println("");
        System.out.println("");
        System.out.println("Escolha entre Pedra, Papel ou Tesoura: ");
        String escolha = scanner.next();
        String escolhaJogador = escolha.toUpperCase();

        if (escolhaJogador.equals(escolhaMaquina)) {
            System.out.println("Você escolheu: " + escolhaJogador);
            System.out.println("A maquina escolheu: " + escolhaMaquina);
            System.out.println("Empate");
        } else if ((escolhaJogador.equals("PEDRA") && escolhaMaquina.equals("TESOURA")) ||
                (escolhaJogador.equals("TESOURA") && escolhaMaquina.equals("PAPEL")) ||
                (escolhaJogador.equals("PAPEL") && escolhaMaquina.equals("PEDRA"))) {

            System.out.println("Você escolheu: " + escolhaJogador);
            System.out.println("");
            System.out.println("A maquina escolheu: " + escolhaMaquina);
            System.out.println("Ganhou");
        } else {
            System.out.println("Você escolheu: " + escolhaJogador);
            System.out.println("");
            System.out.println("A maquina escolheu: " + escolhaMaquina);
            System.out.println("Perdeu");
        }

        System.out.println("");
        System.out.println("Deseja jogar outra vez?? 1 = Sim 2 = Não");
        Integer repetir = scanner.nextInt();

        if (repetir == 1) {
            main(null);
        } else {
            System.exit(0);
        }
    }
}