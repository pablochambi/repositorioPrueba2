package ar.edu.unlam.pb2.ea3;

import java.util.Comparator;

public class OrdenPorNumeroDeCamiseta implements Comparator<Jugador> {

	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getNumeroCamiseta().compareTo(o2.getNumeroCamiseta());
	}

}
