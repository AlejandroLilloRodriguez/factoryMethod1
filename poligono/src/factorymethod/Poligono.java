package factorymethod;

public abstract class Poligono {
    private int numero;

    //Constructor
    public Poligono(int numero) {
        this.numero= numero;
    }
    
    public int getnumero() {
        return numero;
    }

    public void setnumero(int numero) {
    this.numero = numero;
    }

    
    //Métodos a redefinir por las subclases
    public abstract String getDescription();
    
    public abstract double getSuperficie();
    
    public abstract void dibujate();   
}
