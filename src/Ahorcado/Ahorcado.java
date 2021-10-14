
package Ahorcado;


public class Ahorcado {
    private String [] vec_buscar;
    private int can_encont;
    private int can_jugadas;
    private int encontradas;
    private int can_letra;//
    public Ahorcado() {
    }

    public Ahorcado(String[] vec_buscar, int can_encont, int can_jugadas, int encontradas,int can_letra) {
        this.vec_buscar = vec_buscar;
        this.can_encont = can_encont;
        this.can_jugadas = can_jugadas;
        this.encontradas = encontradas;
        this.can_letra = can_letra;
    }

    public String[] getVec_buscar() {
        return vec_buscar;
    }

    public void setVec_buscar(String[] vec_buscar) {
        this.vec_buscar = vec_buscar;
    }

    public int getCan_encont() {
        return can_encont;
    }

    public void setCan_encont(int can_encont) {
        this.can_encont = can_encont;
    }

    public int getCan_jugadas() {
        return can_jugadas;
    }

    public void setCan_jugadas(int can_jugadas) {
        this.can_jugadas = can_jugadas;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getCan_letra() {
        return can_letra;
    }

    public void setCan_letra(int can_letra) {
        this.can_letra = can_letra;
    }
    
        
    
}
