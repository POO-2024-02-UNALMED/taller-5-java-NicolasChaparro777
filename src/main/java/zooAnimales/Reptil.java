package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
    protected static ArrayList<Reptil> listado = new ArrayList<>();
    public static int iguanas;
    public static int serpientes;
    protected String colorEscamas;
    protected int largoCola;

    public Reptil(){
        super();
        listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }
    public void setColorEscamas(String nuevoColorEscamas){
        this.colorEscamas = nuevoColorEscamas;
    }

    public int getLargoCola(){
        return this.largoCola;
    }
    public void setCola(int nuevoLargoCola){
        this.largoCola = nuevoLargoCola;
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public static Reptil crearIguana(String nombreIguana, int edadIguana, String generoIguana){
        Reptil iguana = new Reptil(nombreIguana, edadIguana, "humedal", generoIguana, "verde", 3);
        Reptil.iguanas++;
        return iguana;
    }

    public static Reptil crearSerpiente(String nombreSerpiente, int edadSerpiente, String generoSerpiente){
        Reptil serpiente = new Reptil(nombreSerpiente, edadSerpiente, "jungña", generoSerpiente, "blanco", 1);
        Reptil.serpientes++;
        return serpiente;
    }
}
