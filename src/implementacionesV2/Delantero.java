package implementacionesV2;

import main.Jugador;

public class Delantero implements Jugador{

	@Override
	public void correr() {
		System.out.println("Delantero corre mas V2");
	}

	@Override
	public void parar() {
		System.out.println("delantero se para V2");
	}

}
