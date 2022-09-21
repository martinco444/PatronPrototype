package model;

public class Agua extends MedioTransporte{

    int cantidadHelices = 3;

    public Agua(TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros, int cantidadHelices) {
        super(alimentacion, marca, modelo, cantidadPasajeros);
        this.cantidadHelices = cantidadHelices;
    }

    public Agua clon(){
        Agua clonAgua = new Agua(alimentacion, marca, modelo, cantidadPasajeros, cantidadHelices);
        return clonAgua;
    }
    
    
}

