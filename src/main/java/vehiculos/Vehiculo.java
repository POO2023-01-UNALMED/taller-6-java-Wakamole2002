package vehiculos;

public class Vehiculo {
    protected static int CantidadVehiculos = 0;
    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected int peso;
    protected String traccion;
    protected Fabricante fabricante;

    //construcor ----------
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre,
            int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;

        if (Pais.ventasPorPais.containsKey(fabricante.getPais())) {
            Pais.ventasPorPais.put(fabricante.getPais(), Pais.ventasPorPais.get(fabricante.getPais()) + 1); }
        else {
            Pais.ventasPorPais.put(fabricante.getPais(), 1);    
        }

       if (Fabricante.ventasPorFabrica.containsKey(fabricante)) {
           Fabricante.ventasPorFabrica.put(fabricante, Fabricante.ventasPorFabrica.get(fabricante) + 1);} 
       else {
           Fabricante.ventasPorFabrica.put(fabricante, 1);
       }
    }
    
    //Getters ------------
    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    //Setters ------------
    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    //Metodos ----------------

    public static String vehiculosPorTipo(){
        return "Automoviles: "+ Automovil.getCantAutos()+
             "\nCamionetas: "+ Camioneta.getCantCamionetas()+
             "\nCamiones: "+ Camion.getCantCamiones();
    }

}
