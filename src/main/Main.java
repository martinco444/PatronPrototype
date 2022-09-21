import java.util.Scanner;
import model.MedioTransporte;
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
        int cantidadAlas= 2;

        Aereo avion = new Aereo(alimentacion, marca, modelo, cantidadPasajeros,cantidadAlas);

        Aereo clonAereo = avion.clon();

        avion.setCantidadAlas(2);
        clonAereo.setCantidadAlas(4);

        System.out.println(avion.toString());
        System.out.println(clonAereo.toString());

        Agua lancha = new Agua(alimentacion, marca, modelo, cantidadPasajeros, numeroHelices);

        Agua clonAgua = lancha.clon();

        int cantidadLlantas = 4;
        Terrestre carro = new Terrestre(alimentacion, modelo, marca, cantidadPasajeros, cantidadLlantas);

        Terrestre clonTerrestre = carro.clon();

        carro.setCantidadLlantas(7);
        clonTerrestre.setCantidadLlantas(4);

        System.out.println(carro.toString());
        System.out.println(clonTerrestre.toString());
        


    }
    
}
