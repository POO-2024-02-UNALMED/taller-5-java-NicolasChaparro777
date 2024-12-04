package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    protected static ArrayList<Ave> listado = new ArrayList<>();
    public static int halcones;
    public static int aguilas;
    protected String colorPlumas;

    public Ave(){
        super();
        listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public String getColorPlumas(){
        return this.colorPlumas;
    }
    public void setColorPlumas(String nuevoColorPlumas){
        this.colorPlumas = nuevoColorPlumas;
    }

    @Override
    public String movimiento(){
        return "volar";
    }

    public static Ave crearAguila(String nombreAguila, int edadAguila, String generoAguila){
        Ave aguila = new Ave(nombreAguila, edadAguila, "montañas", generoAguila, "blanco y amarillo");
        Ave.aguilas++;
        return aguila;
    }

    public static Ave crearHalcon(String nombreHalcon, int edadHalcon, String generoHalcon){
        Ave halcon = new Ave(nombreHalcon, edadHalcon, "montañas", generoHalcon, "café glorioso");
        Ave.halcones++;
        return halcon;
    }
}
