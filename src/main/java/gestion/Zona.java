package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    protected String nombre;
    protected Zoologico zoo;
    protected ArrayList<Animal> animales = new ArrayList<>();

    public Zona(){
        this(null, null);
    }

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public Zoologico getZoo(){
        return this.zoo;
    }
    public void setZoo(Zoologico nuevoZoologico){
        this.zoo = nuevoZoologico;
    }

    public void agregarAnimales(Animal nuevoAnimal){
        this.animales.add(nuevoAnimal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }
}
