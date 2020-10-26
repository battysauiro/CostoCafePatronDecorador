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
public abstract class CafeDecorador implements Cafe{
    protected Cafe cafeDecorador;
    
    public CafeDecorador(Cafe cafeDecorador){
        this.cafeDecorador=cafeDecorador;
    }
    
   
    @Override
    public  int tamanio(){
        return cafeDecorador.tamanio();
    }
    @Override
    public  String ingredientes(){
        return cafeDecorador.ingredientes();
    }
    @Override
    public  double costo(){
        return cafeDecorador.costo();
    }
}
