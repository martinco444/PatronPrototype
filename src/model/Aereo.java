package model;

public class Aereo extends MedioTransporte{
    private int cantidadAlas;

    public Aereo(TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros, int cantidadAlas) {
        super(alimentacion, marca, modelo, cantidadPasajeros);
        this.cantidadAlas = cantidadAlas;
    }

    public Aereo clon(){
        Aereo clonAereo = new Aereo(alimentacion, marca, modelo, cantidadPasajeros, cantidadAlas);
        return clonAereo;
    }

    
    public void setCantidadAlas(int cantidadAlas) {
        this.cantidadAlas = cantidadAlas;
    }

    @Override
    public String toString() {
        return "Aereo: cantidad de Alas " + cantidadAlas + ", alimentacion " + alimentacion + ", marca "+ marca + ", modelo " + modelo + ", cantidad de pasajeros " + cantidadPasajeros ;
    }


    


    
}
