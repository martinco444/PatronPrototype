package model;

public class Terrestre extends MedioTransporte {

    int cantidadLlantas = 4;

    public Terrestre(TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros,
            int cantidadLlantas) {
        super(alimentacion, marca, modelo, cantidadPasajeros);
        this.cantidadLlantas = cantidadLlantas;
    }



    public Terrestre clon(){
        Terrestre clonTerrestre = new Terrestre(alimentacion, marca, modelo, cantidadPasajeros, cantidadLlantas);
        return clonTerrestre;
    }
    
    
}
