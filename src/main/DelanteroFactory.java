package main;

public class DelanteroFactory {

	public static Jugador obtenerDelantero() {
		//un uso comun seria cargar el siguiente String de un archivo de configuracion
		
		String rutaclassDelantero = "implementacionesVx2.Delantero";
		
		Jugador delantero = null;
		@SuppressWarnings("rawtypes")
		Class classDelantero = null;
		
		try {
			classDelantero = Class.forName(rutaclassDelantero);
		} catch (Exception e) {
			System.out.println("Fallo de reflection");
			try {
				classDelantero = Class.forName("implementaciones.Delantero");
			} catch (ClassNotFoundException e1) {
				System.out.println("Todo a la mierda");
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		try {
			delantero = (Jugador) classDelantero.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println("no puedo hacer instancia o no puedo acceder al constructor");
			e.printStackTrace();
		}
		
		return delantero;
	}
}
