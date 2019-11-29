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
public class costo_minimo {
    private obo[][]mat;
    private int[]oferta,demanda;
    public costo_minimo(obo[][]mat,int[]oferta,int[]demanda){
        this.mat=mat;
        this.oferta=oferta;
        this.demanda=demanda;
    }
    public posicion BuscaMenor() {

        posicion p;
        int menorValor = Integer.MAX_VALUE;
        int ubicacion_n = Integer.MAX_VALUE;
        int ubicacion_m = Integer.MAX_VALUE;

        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                boolean tmp = mat[f][c].getBloqueo();
                
                if (tmp==false) {

                    if (menorValor > mat[f][c].getRuta()) {
                        menorValor = mat[f][c].getRuta();
                        ubicacion_n = f;
                        ubicacion_m = c ;
                    }

                }

            }

        }
        System.out.println("El menor valor es: = " + menorValor);
        System.out.println("Su ubicacion es: " + ubicacion_n + "," + ubicacion_m);

        p = new posicion(ubicacion_n, ubicacion_m, menorValor);

        return p;

    }

    public boolean Cacelacion(posicion p, boolean b) {

        if (oferta[p.getUbicacion_n()] == demanda[p.getUbicacion_m()]) {

            oferta[p.getUbicacion_n()] = 0;
            demanda[p.getUbicacion_m()] = 0;

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {

                    if (i == p.getUbicacion_n()) {
                        mat[i][j].setBloqueo(true);
                    }
                    if (j == p.getUbicacion_m()) {
                        mat[i][j].setBloqueo(true);
                    }

                }

            }
        }else if (oferta[p.getUbicacion_n()] > demanda[p.getUbicacion_m()]) {

            oferta[p.getUbicacion_n()] = oferta[p.getUbicacion_n()] - demanda[p.getUbicacion_m()];

            demanda[p.getUbicacion_m()] = 0;

            for (int i = 0; i < mat.length; i++) {
                mat[i][p.getUbicacion_m()].setBloqueo(true);

            }

        }else if (oferta[p.getUbicacion_n()] < demanda[p.getUbicacion_m()]) {

            demanda[p.getUbicacion_m()] = demanda[p.getUbicacion_m()] - oferta[p.getUbicacion_n()];

            oferta[p.getUbicacion_n()] = 0;

                for (int j = 0; j < mat[0].length; j++) {

                        mat[p.getUbicacion_n()][j].setBloqueo(true);
                    
                }

            

        }

        for (int i = 0; i < oferta.length; i++) {

            if (oferta[i] != 0) {
                b = false;
                return b;
            }
            if (oferta[i] == 0) {
                b = true;
            }

        }
        return b;
    }

    public void imprime() {
        for (obo[] mat1 : mat) {
            for (obo mat11 : mat1) {
                System.out.print(mat11.getRuta() + " -->" + mat11.isBloqueo() + " ");
            }
            System.out.println();
        }
    }

}
