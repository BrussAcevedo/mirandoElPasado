package mirandoAlPasado;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio4 {

	
	
	
	public static void resultadoEjercicio4() {
		Queue <String>juegos = new LinkedList<>();
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipún");
		juegos.add("Pillarse");
		
		Utilidades.recorrerLista(juegos);
		
		int cantidad  = juegos.size();
		
		System.out.println(cantidad);
	}
}
