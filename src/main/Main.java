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

        Aereo avion = new Aereo(cantidadAlas, alimentacion, marca, modelo, cantidadPasajeros);

        Aereo clonAereo = avion.clonar();

        int numeroHelices = 3;
        Agua lancha = new Agua(numeroHelices, alimentacion, marca, modelo, cantidadPasajeros);

        Agua clonAgua = lancha.clonar();

        int cantidadLlantas = 4;
        Terrestre carro = new Terrestre(cantidadLlantas, alimentacion, modelo, marca, cantidadPasajeros);


    }
    
}
