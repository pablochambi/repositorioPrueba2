package ar.edu.unlam.pb2.ea3;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{

	private Integer numeroCamiseta;
	private String nombre;
	private Integer precio;

	public Jugador(Integer numeroCamiseta, String nombre, Integer precio) {
		this.numeroCamiseta=numeroCamiseta;
		this.nombre=nombre;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Jugador o) {
		return o.getNombre().compareTo(nombre)*(-1);
	}

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}
	
	


}
