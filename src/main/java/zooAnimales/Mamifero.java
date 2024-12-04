package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    protected static ArrayList<Mamifero> listado = new ArrayList<>();
    public static int caballos;
    public static int leones;
    protected Boolean pelaje;
    protected int patas;

    public Mamifero(){
        super();
        listado.add(this);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero){
        this(nombre, edad, habitat, genero, true, 4);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Boolean isPelaje(){
        return this.pelaje;
    }
    public void setPelaje(Boolean nuevoPelaje){
        this.pelaje =nuevoPelaje;
    }

    public int getPatas(){
        return this.patas;
    }
    public void setPatas(int nuevasPatas){
        this.patas = nuevasPatas;
    }

    public static Mamifero crearCaballo(String nombreCaballo, int edadCaballo, String generoCaballo){
        Mamifero caballo = new Mamifero(nombreCaballo, edadCaballo, "pradera", generoCaballo);
        Mamifero.caballos++;
        return caballo;
    }

    public static Mamifero crearLeon(String nombreLeon, int edadLeon, String generoLeon){
        Mamifero leon = new Mamifero(nombreLeon, edadLeon, "selva", generoLeon);
        Mamifero.leones++;
        return leon;
    }

    public int cantidadMamiferos(){
        return listado.size();
    }

}
