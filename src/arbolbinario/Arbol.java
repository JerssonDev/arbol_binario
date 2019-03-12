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
public class Arbol {

    private Nodo root;
    
    public Arbol () {
        
        this.root =  null;
    }
    
    public Nodo getRoot() {
        return root;
    }
    
    public void add (int value) {
        
        Nodo nodo = new Nodo(value);
        
        if (root == null) {
            
            root = nodo;
        } else {
            
            Nodo tmp = root;
            Nodo padre;
            
            while(true){
                
                padre = tmp;
                
                if (value < tmp.getValor()) {
                    tmp = tmp.getHijoI();
                    
                    if (tmp == null) {
                        padre.setHijoI(nodo);
                        return;
                    }
                    
                } else {
                    
                    tmp = tmp.getHijoD();
                    
                    if (tmp == null) {
                        padre.setHijoD(nodo);
                        return;
                    }
                }
                
            }
                
        }

    }
    
    public void showPre (Nodo nodo) {
    
        if (nodo != null) {
            
            System.out.println(nodo.getValor());
            showPre(nodo.getHijoI());
            showPre(nodo.getHijoD());
            
        }
        
    }
    
    public void showEntre (Nodo nodo) {
    
        if (nodo != null) {
            
            showEntre(nodo.getHijoI());
            System.out.println(nodo.getValor());
            showEntre(nodo.getHijoD());
            
        }
        
    }
    
    public void showPost (Nodo nodo) {
    
        if (nodo != null) {
            
            showPost(nodo.getHijoI());
            showPost(nodo.getHijoD());
            System.out.println(nodo.getValor());
   
        }
        
    }
    
}
