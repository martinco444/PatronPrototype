package model;

public class Aereo extends MedioTransporte{
    private int cantidadAlas = 2;

    public Aereo(TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros, int cantidadAlas) {
        super(alimentacion, marca, modelo, cantidadPasajeros);
        this.cantidadAlas = cantidadAlas;
    }

    public Aereo clon(){
        Aereo clonAereo = new Aereo(alimentacion, marca, modelo, cantidadPasajeros, cantidadAlas);
        return clonAereo;
    }


    
}
