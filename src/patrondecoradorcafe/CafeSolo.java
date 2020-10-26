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
public class CafeSolo implements  Cafe{
    
    private int costo=15;
    private int tamanio=200;

    @Override
    public int tamanio() {
        return tamanio;
    }

    @Override
    public String ingredientes() {
        return "ingredientes";
    }

    @Override
    public double costo() {
        return costo;
    }
    
    
    
}
