package main;

import model.Agua;
import model.Aereo;
import model.Terrestre;
import model.TipoAlimentacion;


public class Main {

    public static void main(String[] args){
        
        int cantidadPasajeros = 5;
        String modelo = "2020";
        String marca = "volvo";
        TipoAlimentacion alimentacion = TipoAlimentacion.Gasolina;
        int cantidadAlas = 0;

        
        System.out.println("--------");

        Aereo avion = new Aereo(alimentacion, marca, modelo, cantidadPasajeros,cantidadAlas);
        Aereo clonAereo = avion.clon();

        avion.setCantidadAlas(2);
        clonAereo.setCantidadAlas(4);

        System.out.println("Original: " + avion.toString());
        System.out.println("Clon: " + clonAereo.toString());

        System.out.println("--------");

        int cantidadHelices= 0;

        Agua lancha = new Agua(alimentacion, marca, modelo, cantidadPasajeros, cantidadHelices);

        Agua clonAgua = lancha.clon();

        lancha.setCantidadHelices(4);
        clonAgua.setCantidadHelices(8);

        System.out.println("Original: " + lancha.toString());
        System.out.println("Clon: " + clonAgua.toString());

        
        System.out.println("--------");

        int cantidadLlantas= 0;
        Terrestre carro = new Terrestre(alimentacion, marca, modelo,  cantidadPasajeros, cantidadLlantas);

        Terrestre clonTerrestre = carro.clon();

        carro.setCantidadLlantas(7);
        clonTerrestre.setCantidadLlantas(4);

        System.out.println("Original: " + carro.toString());
        System.out.println("Clon: " + clonTerrestre.toString());

        
        System.out.println("--------");
        


    }
    
}
