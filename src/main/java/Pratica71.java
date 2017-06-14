
import java.util.List;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica71 {
    public static void main(String[] args) {
        Time time = new Time();
        
        Scanner scanner = new Scanner(System.in);
        int numJogadores;
        int numJogador = 0;
        System.out.print("Informe a quantidade de jogadores: ");
        numJogadores = scanner.nextInt();
        
        for(int i = 0; i < numJogadores; i++) {
            System.out.print("Informe o número do jogador: ");
            if(scanner.hasNextInt()) {
                numJogador = scanner.nextInt();
            }
            System.out.print("Informe o nome do jogador: ");
            String nomeJogador = scanner.next();
            time.addJogador(new Jogador(numJogador, nomeJogador));
        }
      
        JogadorComparator ordem = new JogadorComparator(true, true, false);
        List<Jogador> timeA = time.ordena(ordem);  

         timeA.forEach((jogador) -> {
            System.out.println(jogador.toString());
        });
        
        
        while(numJogador != 0) {
            System.out.print("Informe o número do jogador: ");
            if(scanner.hasNextInt()) {
                numJogador = scanner.nextInt();
            }
            if(numJogador == 0) break;
            System.out.print("Informe o nome do jogador: ");
            String nomeJogador = scanner.next();
            time.addJogador(new Jogador(numJogador, nomeJogador));
            
            time.ordena(ordem);
            timeA.forEach((jogador) -> {
                System.out.println(jogador.toString());
            });
        }
        
        timeA.forEach((jogador) -> {
            System.out.println(jogador.toString());
        });
        
    }
}
