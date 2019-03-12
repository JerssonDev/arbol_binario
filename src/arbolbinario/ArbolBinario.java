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
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol a = new Arbol();
        a.add(4);
        a.add(2);
        a.add(5);
        a.add(8);
        a.add(14);
        System.out.println("Modo PreOrden");
        a.showPre(a.getRoot());
        System.out.println("Modo EntreOrden");
        a.showEntre(a.getRoot());
        System.out.println("Modo PostOrden");
        a.showPost(a.getRoot());
        
    }
    
}
