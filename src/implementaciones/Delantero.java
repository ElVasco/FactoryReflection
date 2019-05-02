package implementaciones;

import main.Jugador;

public class Delantero implements Jugador{

	@Override
	public void correr() {
		System.out.println("Deltantero corre");
	}

	@Override
	public void parar() {
		System.out.println("Delantero se para");
	}

}
