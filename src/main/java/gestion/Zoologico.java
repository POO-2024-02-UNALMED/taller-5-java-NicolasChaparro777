package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<>();

    public Zoologico(){
        this(null, null);
    }

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getUbicacion(){
        return this.ubicacion;
    }
    public void setUbicacion(String nuevaUbicacion){
        this.ubicacion = nuevaUbicacion;
    }

    public void agregarZonas(Zona nuevaZona){
        this.zonas.add(nuevaZona);
    }

    public ArrayList<Zona> getZona(){
        return this.zonas;
    }
    
    public int cantidadTotalAnimales(){
        int contador = 0;
        
        for (Zona zonasTotales : zonas){
            contador += zonasTotales.cantidadAnimales();
        }

        return contador;
    }
}
