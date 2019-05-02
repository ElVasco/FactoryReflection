package main;


public class Main {

	public static void main(String[] args) {
		Jugador juan = DelanteroFactory.obtenerDelantero();
		juan.correr();
		//ventajas de usar factory con reflection:
		//	si delantero de implementaciones V2 no esta diponible
		//		de usara el delantero del paquete implementaciones sin
		//		tener que cambiar codigo.
		//	Como comentabamos en DelanteroFactory cargando la ruta de
		//		la clase por un archivo externo, el archivo externo podra
		//		decidir si usar una implementacion u otra segun nos interese
		//		sin tener que modificar codigo java
	}

}
