package ar.edu.unlam.pb2.ea3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EquipoDeFutbol {

	private String nombre;
	private TreeSet<Jugador> jugadores;
	private final Integer CAPACIDAD_MAXIMA = 23;

	public EquipoDeFutbol(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		this.jugadores = new TreeSet<>();
	}

	/*
	 * La capacidad m�xima de un equipo es 23. Cualquier intento de agregar m�s
	 * jugadores generar� una excepci�n (CapacidadMaximaException). Adem�s, no
	 * deber� permitir duplicar Jugadores (JugadorDuplicadoException).
	 */
	public void agregarJugador(Jugador jugador) throws CapacidadMaximaException, JugadorDuplicadoException {
		
		if(cantidadDeJugadores()>=CAPACIDAD_MAXIMA)
			throw new CapacidadMaximaException();
			
		if(!this.jugadores.add(jugador)) 
			throw new JugadorDuplicadoException();
	}

	private Integer cantidadDeJugadores() {
		return this.jugadores.size();
	}

	/*
	 * Permite cambiar cualquier jugador. Un intento de cambiar un jugador no
	 * presente en el equipo generar� una excepci�n
	 * (JugadoreInexistenteException).
	 */
	public Boolean cambiarJugador(Jugador saliente, Jugador entrante) throws JugadoreInexistenteException{
		if(!this.jugadores.contains(saliente))
			throw new JugadoreInexistenteException();
		
		this.jugadores.remove(saliente);
		
		return this.jugadores.add(entrante);
	}

	

//	public TreeSet<Jugador> devolverPlanteOrdenadoPorNombreDeJugador() {
//		
//		return null;
//	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorPrecioDeCompraDeJugador() {
		
		TreeSet<Jugador> jugOrd = new TreeSet<>(new OrdenPorPrecioDeCompra());
		jugOrd.addAll(this.jugadores);
		
		return jugOrd;
	}

	public TreeSet<Jugador> devolverPlanteOrdenadoPorNumeroDeCamisetaDeJugador() {
		TreeSet<Jugador> jugOrd = new TreeSet<>(new OrdenPorNumeroDeCamiseta());
		jugOrd.addAll(this.jugadores);
		
		return jugOrd;
	}

	public TreeSet<Jugador> getJugadores() {
		return jugadores;
	}

	

}
