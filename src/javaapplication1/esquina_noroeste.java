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
public class esquina_noroeste {

    private obo[][] mat;
    private int[] oferta, demanda;

    public esquina_noroeste(obo[][] mat, int[] oferta, int[] demanda) {
        this.mat = mat;
        this.oferta = oferta;
        this.demanda = demanda;
    }

    public boolean Esquina() {

        posicion p;

        int ubicacion_n = Integer.MAX_VALUE;
        int ubicacion_m = Integer.MAX_VALUE;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (oferta[i] > 0) {

                    if (mat[i][j].getBloqueo() == false) {

                        if (oferta[i] == demanda[j]) {

                            oferta[i] = 0;
                            demanda[j] = 0;

                            for (int a = 0; a < mat.length; a++) {
                                for (int b = 0; b < mat[0].length; b++) {

                                    if (a == i) {
                                        mat[a][b].setBloqueo(true);
                                    }
                                    if (a == j) {
                                        mat[a][b].setBloqueo(true);
                                    }

                                }

                            }
                        } else if (oferta[i] > demanda[j]) {

                            oferta[i] = oferta[i] - demanda[j];

                            demanda[j] = 0;

                            for (int c = 0; c < mat.length; c++) {
                                mat[c][j].setBloqueo(true);

                            }

                        } else if (oferta[i] < demanda[j]) {

                            demanda[j] = demanda[j] - oferta[i];

                            oferta[i] = 0;

                            for (int d = 0; d < mat[0].length; d++) {

                                mat[i][d].setBloqueo(true);

                            }

                        }

                        for (obo[] mat1 : mat) {
                            for (obo mat11 : mat1) {
                                System.out.print(mat11.getRuta() + " -->" + mat11.isBloqueo() + " ");
                            }
                            System.out.println();
                        }
                         for (int e = 0; e < oferta.length; e++) {
                            System.out.println("oferta es: " + oferta[e] + ", ");
                        }

                        for (int f = 0; f < demanda.length; f++) {
                            System.out.println("demanda es: " + demanda[f] + ", ");
                        }
                        
                        
                        System.out.println("\n");

                    }

                } else {
                    break;
                }

            }
        }
        boolean b = false;

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
