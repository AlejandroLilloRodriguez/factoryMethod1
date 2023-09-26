package factorymethod;

public class PoligonoFactory implements PoligonoFactoryMethod {

    @Override
    public Poligono createPoligono(int numero) {
        
        if ( numero==0 ) {
            return new Circulo(numero);
        }
        else if ( numero==3 ) {
            return new Triangulo(numero););
        }
        else if(numero==4){
            return new Cuadrado(numero);
        }
    }
}
