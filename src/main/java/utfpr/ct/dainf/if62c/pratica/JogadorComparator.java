/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author leandro
 */
public class JogadorComparator implements Comparator<Jogador>{

    private final boolean porNum;
    private final int porNumAsc;
    private final int porNomeAsc;
    
    
    public JogadorComparator() {
        porNum = true;
        porNumAsc = 1;
        porNomeAsc = 1;
    }    
    
    public JogadorComparator(boolean porNum, boolean porNumAsc, boolean porNomeAsc) {
        this.porNum = porNum;
        
        if (porNumAsc == true)
            this.porNumAsc = +1;
        else this.porNumAsc = -1;
      
        if (porNomeAsc == true)
            this.porNomeAsc = +1;
        else this.porNomeAsc = -1;

    }    
           
    @Override
    public int compare(Jogador o1, Jogador o2) {
        if (porNum == true)
         if (o1.getNumero() == o2.getNumero())
            if (o1.getNome().equalsIgnoreCase(o2.getNome()))
                return(0);
            else return((o1.getNome().compareToIgnoreCase(o2.getNome())) * this.porNomeAsc);
         else return((o1.getNumero()- o2.getNumero()) * this.porNumAsc);
      else
        if (o1.getNome().equalsIgnoreCase(o2.getNome()))
           return((o1.getNumero() - o2.getNumero()) * this.porNumAsc);
        else return((o1.getNome().compareToIgnoreCase(o2.getNome())) * this.porNomeAsc);    
    }
    
}
