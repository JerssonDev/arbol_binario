/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author mendoza
 */
public class Nodo {
    
    private int valor;
    private Nodo hijoD;
    private Nodo hijoI;

    public Nodo(int valor) {
        this.valor = valor;
        this.hijoD = this.hijoI = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getHijoD() {
        return hijoD;
    }

    public void setHijoD(Nodo hijoD) {
        this.hijoD = hijoD;
    }

    public Nodo getHijoI() {
        return hijoI;
    }

    public void setHijoI(Nodo hijoI) {
        this.hijoI = hijoI;
    }

    @Override
    public String toString() {
        return "Nodo{" + "valor=" + valor + ", hijoD=" + hijoD + ", hijoI=" + hijoI + '}';
    }   
    
}
