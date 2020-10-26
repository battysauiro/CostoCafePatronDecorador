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
public class Crema extends CafeDecorador{
    
    public Crema(Cafe cafeDecorador) {
        super(cafeDecorador);
    }
    
    @Override
    public int tamanio() {
        return super.tamanio();
        
    }

    @Override
    public String ingredientes() {
        return super.ingredientes()+","+"crema";
    }

    @Override
    public double costo() {
        return super.costo()+1;
    }
}
