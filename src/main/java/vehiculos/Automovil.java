package vehiculos;

public class Automovil extends Vehiculo {
    static int cantAutos = 0;
    int puestos;

    //Constructor --------------
    public Automovil(String placa, String nombre, int precio, int peso,
        Fabricante fabricante, int puestos) {
        super(placa, 4,100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        cantAutos++;
    }
    //Getters --------------
    public int getPuestos() {
        return puestos;
    }
    public static int getCantAutos() {
        return cantAutos;
    }
    //Setters --------------
    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
    
}
