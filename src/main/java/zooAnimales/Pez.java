package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
    protected static ArrayList<Pez> listado = new ArrayList<>();
    public static int salmones;
    public static int bacalaos;
    protected String colorEscamas;
    protected int cantidadAletas;

    public Pez(){
        super();
        listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setColorEscamas(String nuevoColorEscamas){
        this.colorEscamas = nuevoColorEscamas;
    }

    public int getCantidadAletas(){
        return this.cantidadAletas;
    }
    public void setCantidadAletas(int nuevoCantidadAletas){
        this.cantidadAletas = nuevoCantidadAletas;
    }

    @Override
    public String movimiento(){
        return "nadar";
    }

    public static Pez crearSalmon(String nombreSalmon, int edadSalmon, String generoSalmon){
        Pez salmon = new Pez(nombreSalmon, edadSalmon, "océano", generoSalmon, "rojo", 6);
        Pez.salmones++;
        return salmon;
    }

    public static Pez crearBacalao(String nombreBacalao, int edadBacalao, String generoBacalao){
        Pez bacalao = new Pez(nombreBacalao, edadBacalao, "océano", generoBacalao, "gris", 6);
        Pez.bacalaos++;
        return bacalao;
    }
}
