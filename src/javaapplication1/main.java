/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author juand Húngaro y costo mínimo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        int filas = 3;
//        int colum = 4;
        obo[][]mat =
        
        {   {new obo(5),new obo(2),new obo(7),new obo(3)},
                        {new obo(3),new obo(6),new obo(6),new obo(1)},
                        {new obo(6),new obo(1),new obo(2),new obo(4)},
                        {new obo(4),new obo(3),new obo(6),new obo(6)}
        };

        int[] oferta = {80,30,60,45};
        int[] demanda = {70,40,70,35};

        // llenado de la matriz
        
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//
//                int f = i + 1;
//                int c = j + 1;
//                int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en valor " + f + "," + c));
//                mat[i][j] = new obo(valor);
//            }
//            int f = i + 1;
//            int ofertaadd = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la oferta " + f));
//            oferta[i] = ofertaadd;
//        }
//
//        for (int i = 0; i < demanda.length; i++) {
//            int f = i + 1;
//            int demandaadd = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la demanda  " + f));
//            demanda[i] = demandaadd;
//        }
                

      // Costo Minimo
       costo_minimo cm =new costo_minimo(mat,oferta,demanda);
       posicion ps;
       boolean bl = false;
       
       
       for (int i = 0; i < oferta.length; i++) {
                System.out.println("oferta es: " +oferta[i]+ ", ");
            }
            
            for (int i = 0; i < demanda.length; i++) {
                System.out.println("demanda es: " +demanda[i]+ ", ");
            }   
       
        do {   
            
            ps =  cm.BuscaMenor();
            bl = cm.Cacelacion(ps, bl);
            cm.imprime();
            
            for (int i = 0; i < oferta.length; i++) {
                System.out.println("oferta es: " +oferta[i]+ ", ");
            }
            
            for (int i = 0; i < demanda.length; i++) {
                System.out.println("demanda es: " +demanda[i]+ ", ");
            }
            
        } while (bl == false);
        
        //Esquina NO
        
//        esquina_noroeste en = new esquina_noroeste(mat, oferta, demanda);
//        boolean blen = false;
//        
//        do {   
//            
//           
//            blen = en.Esquina();
//            en.imprime();
//            
//            
//            
//        } while (blen == false);
//        
//        for (int i = 0; i < oferta.length; i++) {
//                System.out.println("oferta es: " +oferta[i]+ ", ");
//            }
//            
//            for (int i = 0; i < demanda.length; i++) {
//                System.out.println("demanda es: " +demanda[i]+ ", ");
//            }
//       
//       
       
        

    }

}
