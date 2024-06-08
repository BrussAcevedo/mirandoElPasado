package mirandoAlPasado;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void resultadoEjercicio2() {
		Set<String> invitados = new TreeSet<>();
		invitados.add("Daniel");
		invitados.add("Paola");
		invitados.add("Facundo");
		invitados.add("Pedro");
		invitados.add("Jacinta");
		invitados.add("Florencia");
		invitados.add("Juan Pablo");
		
		// 2- agregar a 3 excompañeros mas
		System.out.println("3- Listado unido de invitados:");
		Set<String> invitados2 = new TreeSet<>();
		invitados2.add("Jorge");
		invitados2.add("Francisco");
		invitados2.add("Marcos");
		invitados.addAll(invitados2);
		Utilidades.recorrerLista(invitados);
		System.out.println("Listado unido:");
		System.out.println("------------------------------------------------");
		
		System.out.println("4- Me cae mal Jorge lo elimino:");
		Utilidades.eliminarElemento(invitados, "Jorge");
		Utilidades.recorrerLista(invitados);
	}
	
}
