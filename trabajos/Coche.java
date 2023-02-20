import java.lang.reflect.Constructor;

public class Coche {
    String marca;
    int numPuertas;
    
public Coche(String marca, int numPuertas){
this.marca = marca;
this.numPuertas = numPuertas;
}
public void mostrarCoche() {
    System.out.println("El Coche es marca: " + marca);
    System.out.println("El Coche tiene: " + numPuertas + " puertas");
}
}  


