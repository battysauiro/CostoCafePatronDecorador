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
public class Canela extends CafeDecorador{
    
    public Canela(Cafe cafeDecorador) {
        super(cafeDecorador);
    }

    
    @Override
    public int tamanio() {
        return super.tamanio();
        
    }

    @Override
    public String ingredientes() {
        return super.ingredientes()+","+"canela";
    }

    @Override
    public double costo() {
        return super.costo()+0.50;
    }
    
}
