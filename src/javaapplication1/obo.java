package javaapplication1;
public class obo {
    private int ruta;
    private boolean bloqueo;
    
    public obo(int ruta){
        this.ruta = ruta;
        bloqueo = false;
        
    }
//
//    public int getRuta() {
//        return ruta;
//    }
//
//    public boolean isBloqueo() {
//        return bloqueo;
//    }
//
//    public void setRuta(int ruta) {
//        this.ruta = ruta;
//    }
//
//    public void setBloqueo(boolean bloqueo) {
//        this.bloqueo = bloqueo;
//    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public boolean isBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(boolean bloqueo) {
        this.bloqueo = bloqueo;
    }
    
    public boolean getBloqueo( ){
    return this.bloqueo;
  }
    
}
