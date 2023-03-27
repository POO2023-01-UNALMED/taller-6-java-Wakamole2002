package vehiculos;

public class Camion extends Vehiculo {
    static int cantCamiones = 0;
    int ejes;

    //Constructor --------------
    public Camion(String placa, String nombre, int precio, int peso,
            Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        cantCamiones++;
    }
    //Getters --------------
    public int getEjes() {
        return ejes;
    }
    public static int getCantCamiones() {
        return cantCamiones;
    }
    //Setters --------------
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    
}
