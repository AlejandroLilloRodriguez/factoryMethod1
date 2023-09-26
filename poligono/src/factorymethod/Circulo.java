package factorymethod;

public class Circulo extends Poligono {

    public Circulo(int numero) {
        super(numero);
    }

    @Override
    public String getDescription() {
        return "Soy un circulo";
    }

    @Override
    public double getSuperficie() {
        //Aquí iría el algoritmo para calcular la superficie de un triángulo escaleno
        return 0;
    }

    @Override
    public void dibujate() {
        //Aquí iría el algoritmo para dibujar un triángulo escaleno.
        System.out.println("Dibujando un circulo");
    }
}
