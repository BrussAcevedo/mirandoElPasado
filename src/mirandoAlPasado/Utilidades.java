package mirandoAlPasado;

import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class Utilidades {

	public static void recorrerLista(ArrayList<String> lista) {
		for (String marca : lista) {
			System.out.println(marca);
		}
	}
	
	public static void recorrerLista(Set<String> lista) {
		for (String marca : lista) {
			System.out.println(marca);
		}
	}
	public static void recorrerLista(Queue<String> lista) {
		for (String marca : lista) {
			System.out.println(marca);
		}
	}
	public static void eliminarElemento(ArrayList<String> lista, String marcaAEliminar) {

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equals(marcaAEliminar)) {
				lista.remove(i);
			}
		}
	}
	
	public static void eliminarElemento(Set<String> lista, String invitado) {
			if (lista.contains(invitado)) {
				lista.remove(invitado);
			}else {
				System.out.println("No se encuentra el invitado a eliminar.");
			}
		}
	
	
	public static Map<String, Integer>mapeoFiltrado(Map<String, Integer> mapeo, Integer valorAComparar) {
		Map<String, Integer> mapeoFiltrado = new TreeMap<>();
		for (Map.Entry<String, Integer> temp: mapeo.entrySet()) {
			if(temp.getValue()==valorAComparar) {
				mapeoFiltrado.put(temp.getKey(), temp.getValue());
			}		
			
		}
		return  mapeoFiltrado;
	}
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	

