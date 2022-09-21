package model;

public class Terrestre extends MedioTransporte {

    private int cantidadLlantas;

    public Terrestre(TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros, int cantidadLlantas) {
        super(alimentacion, marca, modelo, cantidadPasajeros);
        this.cantidadLlantas = cantidadLlantas;
    }



    public Terrestre clon(){
        Terrestre clonTerrestre = new Terrestre(alimentacion, marca, modelo, cantidadPasajeros, cantidadLlantas);
        return clonTerrestre;
    }


    public void setCantidadLlantas(int cantidadLlantas) {
        this.cantidadLlantas = cantidadLlantas;
    }


    @Override
    public String toString() {
        return "Terrestre: cantidad de llantas " + cantidadLlantas + ", alimentacion " + alimentacion + ", marca "+ marca + ", modelo " + modelo+ ", cantidad pasajeros "+ cantidadPasajeros;
    }



  

    
    
    
}
