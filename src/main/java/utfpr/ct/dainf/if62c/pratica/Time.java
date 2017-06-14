package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Time {
    private final HashMap<String, Jogador> jogadores = new HashMap<>();

    public HashMap<String, Jogador> getJogadores() {
        return jogadores;
    }
    
    public void addJogador(String x, Jogador y) {
        this.jogadores.put(x, y);
    }
 
     public List<Jogador> ordenação(JogadorComparator a) {
        List<Jogador> lista = new ArrayList<>(jogadores.size());
        getJogadores().keySet().forEach((n) -> {
            lista.add(new Jogador(getJogadores().get(n).num, getJogadores().get(n).name));
        });
        return lista;
    }
}
