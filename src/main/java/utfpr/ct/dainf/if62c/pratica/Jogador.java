package utfpr.ct.dainf.if62c.pratica;
public class Jogador implements Comparable<Jogador> {
    public int num;
    public String name;
    public Jogador(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return num + " - " + name;
    }

    @Override
    public int compareTo(Jogador jogador) {
        return num - jogador.num;
    }


}