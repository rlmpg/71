/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author leandro
 */
public class Time {
    private final List<Jogador> jogadores = new ArrayList<>();
    
    public Time() {
        
    }
    
    /**
     *
     * @param jogador Objeto da classe Jogador
     */
    public void addJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    
     
    
    public List<Jogador> ordena(JogadorComparator jc) {
        
        Collections.sort(jogadores, jc);
        
        return jogadores;
    }
    
}