package model;

public class Aereo extends MedioTransporte{
    private int cantidadAlas = 2;

    public Aereo(int cantidadAlas, TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros) {
        super(alimentacion, marca, modelo, cantidadPasajeros);
        
        
    }


    
}
