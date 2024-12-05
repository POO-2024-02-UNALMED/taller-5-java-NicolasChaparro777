package zooAnimales;

import gestion.Zona;

public class Animal {
    protected static int totalAnimales;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona zona;

    public Animal(){
        this(null,0,null,null);
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public int getTotalAnimales(){
        return Animal.totalAnimales;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int nuevaEdad){
        this.edad = nuevaEdad;
    }

    public String getHabitat(){
        return this.habitat;
    }
    public void setHabitat(String nuevoHabitat){
        this.habitat = nuevoHabitat;
    }

    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String nuevoGenero){
        this.genero = nuevoGenero;
    }

    public Zona getZona(){
        return this.zona;
    }
    public void setZona(Zona nuevaZona){
        this.zona = nuevaZona;
    }

    public String movimiento(){
        return "desplazarse";
    }

    public static String totalPorTipo(){
        String mensaje = "Mamiferos: " + Mamifero.listado.size() +"\n" + "Aves: " + Ave.listado.size() + "\n" + "Reptiles: " + Reptil.listado.size() + "\n" + "Peces: " + Pez.listado.size() + "\n" + "Anfibios: " + Anfibio.listado.size();
        return mensaje;
    }

    @Override
    public String toString(){
        String mensaje = "";
        if (zona != null){
            mensaje = "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + " en el " + this.zona.getZoo().getNombre();
        }
        else{
            mensaje = "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
        }
        return mensaje;
    }
}
