package factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
       PoligonoFactoryMethod factoria = new PoligonoFactory();
        Poligono circulo = factoria.createPoligono(0);
        Poligono triangulo = factoria.createPoligono(3);
        Poligono cuadrado = factoria.createPoligono(4);

        System.out.println("********** POLIGONOS GENERADOS **********");
        System.out.println("Poligono 1: " + circulo.getDescription());
        System.out.println("Poligono2: " + triangulo.getDescription());
        System.out.println("Poligono3: " + cuadrado.getDescription());
    }
}
