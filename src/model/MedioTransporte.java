package model;

import model.TipoAlimentacion;

public class MedioTransporte{

	public TipoAlimentacion alimentacion;
	public String marca;
	public String modelo;
	public int cantidadPasajeros;

	public MedioTransporte(TipoAlimentacion alimentacion, String marca, String modelo, int cantidadPasajeros ){

		this.alimentacion = alimentacion;
		this.marca = marca;
		this.modelo = modelo;
		this.cantidadPasajeros = cantidadPasajeros;

	}

	public TipoAlimentacion getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(TipoAlimentacion alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

}