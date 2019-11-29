/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author juand
 */
public class posicion {
    
    private int ubicacion_n;
    private int ubicacion_m;
    private int menor_valor; 

    
     public posicion() {
    }
     
    public posicion(int ubicacion_n, int ubicacion_m, int menor_valor) {
        this.ubicacion_n = ubicacion_n;
        this.ubicacion_m = ubicacion_m;
        this.menor_valor = menor_valor;
    }

    public int getUbicacion_n() {
        return ubicacion_n;
    }

    public void setUbicacion_n(int ubicacion_n) {
        this.ubicacion_n = ubicacion_n;
    }

    public int getUbicacion_m() {
        return ubicacion_m;
    }

    public void setUbicacion_m(int ubicacion_m) {
        this.ubicacion_m = ubicacion_m;
    }

    public int getMenor_valor() {
        return menor_valor;
    }

    public void setMenor_valor(int menor_valor) {
        this.menor_valor = menor_valor;
    }

   
    
    
    
    
    
    
}
