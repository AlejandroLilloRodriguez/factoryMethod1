package factorymethod;

public class Cuadrado extends Poligono {

    public Cuadrado(int numero) {
        super(numero);
    }

    @Override
    public String getDescription() {
        return "Soy un cuadrado";
    }

    @Override
    public double getSuperficie() {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo equilatero
        return 0;
    }

    @Override
    public void dibujate() {
        //Aquí iría el algoritmo para dibujar un triángulo equilatero.
        System.out.println("Dibujando un Cuadrado");
    }
}
