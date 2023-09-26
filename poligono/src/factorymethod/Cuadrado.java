package factorymethod;

public class Equilatero extends POligono {

    public Equilatero(int numero) {
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
