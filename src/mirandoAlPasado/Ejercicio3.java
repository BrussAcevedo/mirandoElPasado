package mirandoAlPasado;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {

	
	
	public static void resultadoEjercicio3() {
		Map<String, Integer> golosinas = new TreeMap<>();
		
		golosinas.put("Chocman", 100);
		golosinas.put("Trululú", 100);
		golosinas.put("Centella", 100);
		golosinas.put("Kilate", 50);
		golosinas.put("Miti-miti", 30);
		golosinas.put("Traga Traga", 150);
		golosinas.put("Tableton", 100);
		
		System.out.println("3- Filtrar golosinas 100");
		Map<String, Integer> golosinas100 = new TreeMap<>();
		
		golosinas100 = Utilidades.mapeoFiltrado(golosinas, 100);
		System.out.println(golosinas100);	
	}
	
}
