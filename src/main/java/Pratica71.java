import java.util.Scanner;
import java.util.ArrayList;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import java.util.Collections;
/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica71 {  
    private static final ArrayList<Jogador> team = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int num = 0;
        String name = null;
        Integer numjogadores;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Número de jogadores a serem lidos: ");
        numjogadores = scanner.nextInt();
        for (int i = 0; i < numjogadores; i++){
            System.out.println("Número do Jogador: ");            
            boolean verifica = false;
            while(!verifica){
                verifica = scanner.hasNextInt();
                if(verifica)
                    num = scanner.nextInt();
                else
                    scanner.next();
            }
            System.out.println("Nome do jogador: ");
            scanner.next();
            
            team.add(new Jogador(num, name));
        }
        
        Collections.sort(team);
        showTeam();
        
   
       while(num > 0){
            System.out.println("Número do Jogador: ");            
            boolean verifica = false;
            while(!verifica){
                verifica = scanner.hasNextInt();
                if(verifica)
                    num = scanner.nextInt();
                else
                    scanner.next();
            }
            System.out.println("Nome do jogador: ");
            scanner.next();
            Jogador x = new Jogador(num, name);
            int posicao = Collections.binarySearch(team, x);
            
            if(posicao < 0){
                team.add(-1, x);
            }else
                team.set(posicao, x);
            
       }        
        
    }
    
    private static void showTeam(){
        System.out.println("Time:\n");
        for (Jogador x: team) {
            System.out.printf("%d  -  %s\n", x.getNum(), x.getName());
        } 
    }
}
