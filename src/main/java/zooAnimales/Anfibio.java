package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
    protected static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    protected String colorPiel;
    protected Boolean venenoso;

    public Anfibio(){
        super();
        listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Boolean isVenenoso(){
        return this.venenoso;
    }
    public void setVenenoso(Boolean nuevoVenenoso){
        this.venenoso =nuevoVenenoso;
    }

    public String getColorPiel(){
        return this.colorPiel;
    }
    public void setColorPiel(String nuevoColorPiel){
        this.colorPiel = nuevoColorPiel;
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public static Anfibio crearRana(String nombreRana, int edadRana, String generoRana){
        Anfibio rana = new Anfibio(nombreRana, edadRana, "selva", generoRana, "rojo", true);
        Anfibio.ranas++;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombreSalamandra, int edadSalamandra, String generoSalamandra){
        Anfibio salamandra = new Anfibio(nombreSalamandra, edadSalamandra, "selva", generoSalamandra, "negro y amarillo", false);
        Anfibio.salamandras++;
        return salamandra;
    }
}
