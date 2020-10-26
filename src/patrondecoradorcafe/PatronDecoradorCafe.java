/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecoradorcafe;

/**
 *
 * @author Oscar
 */
public class PatronDecoradorCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cafe cafe =new CafeSolo();
        cafe=new Crema(cafe);
        System.out.println("bebida "+cafe.ingredientes()+" costo "+cafe.costo()+" tamaño "+cafe.tamanio());
        cafe=new Canela(cafe);
        System.out.println("bebida "+cafe.ingredientes()+" costo "+cafe.costo()+" tamaño "+cafe.tamanio());
        Leche leche=new Leche(cafe);
        System.out.println("bebida "+leche.ingredientes()+" costo "+leche.costo()+" tamaño "+leche.tamanio());
    }
    
}
