package model;

public class Agua extends MedioTransporte{

    int cantidadHelices;

    public Agua(TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros, int cantidadHelices) {
        super(alimentacion, marca, modelo, cantidadPasajeros);
        this.cantidadHelices = cantidadHelices;
    }

    
    public void setCantidadHelices(int cantidadHelices) {
        this.cantidadHelices = cantidadHelices;
    }

    public Agua clon(){
        Agua clonAgua = new Agua(alimentacion, marca, modelo, cantidadPasajeros, cantidadHelices);
        return clonAgua;
    }


    @Override
    public String toString() {
        return "Agua: cantidadHelices " + cantidadHelices + ", alimentacion " + alimentacion + ", marca "+ marca + ", modelo " + modelo + ", cantidad de pasajeros " + cantidadPasajeros + ", cantidad de helices " + cantidadHelices;
    }
    
 }



