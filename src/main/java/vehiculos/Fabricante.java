package vehiculos;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;


public class Fabricante {
    static Map<Fabricante, Integer> ventasPorFabrica = new HashMap <Fabricante, Integer>();
    String nombre;
    Pais pais;
    
    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas(){
        int valorMax = -1;
        Fabricante fabricaMayorVentas = null;

        for (Entry<Fabricante, Integer> entry : ventasPorFabrica.entrySet()) {
            int valorActual = entry.getValue();

            if (valorActual > valorMax){
                valorMax = valorActual;
                fabricaMayorVentas = entry.getKey();
            }
        }
        return fabricaMayorVentas;
    }
    
}
