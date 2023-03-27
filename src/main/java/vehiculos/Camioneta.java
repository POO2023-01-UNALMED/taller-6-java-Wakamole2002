package vehiculos;

public class Camioneta extends Vehiculo {
    static int cantCamionetas = 0;
    boolean volco;
    
    //Constructor --------------
    public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
           Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        cantCamionetas++;
    }
    //Getters --------------
    public boolean isVolco() {
        return volco;
    }
    public static int getCantCamionetas() {
        return cantCamionetas;
    }
    //Setters --------------
    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    
}
