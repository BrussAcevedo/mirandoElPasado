package mirandoAlPasado;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void resultadoEjercicio1() {
		ArrayList<String> marcas = new ArrayList<>();
		System.out.println("2- Marcas conocidas: ");
		marcas.add("Carrefour");
		marcas.add("Nike");
		marcas.add("Rebook");
		marcas.add("Yamaha");
		marcas.add("Mapex");
		marcas.add("Intel");
		marcas.add("Amd");
		marcas.add("Nvidia");
		marcas.add("Evga");
		marcas.add("Zotac");
		Utilidades.recorrerLista(marcas);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("");

		System.out.println("3- Mi amiga se acordo de 3 marcas mas:");
		marcas.add("BlokBaster");
		marcas.add("Carrefour");
		marcas.add("Jetix");
		Utilidades.recorrerLista(marcas);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("");

		System.out.println("4- Correccion nombres blockBuster");
		marcas.set(10, "BlockBuster");
		Utilidades.recorrerLista(marcas);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("");

		System.out.println("5- Eliminar numero 11: ");
		Utilidades.eliminarElemento(marcas, "Carrefour");
		Utilidades.recorrerLista(marcas);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("");

		System.out.println("6- Nuevo Arraylist marcas fuera del mercado");
		ArrayList<String> marcasFueraMercado = new ArrayList<>();
		marcasFueraMercado.add("Compaq");
		marcasFueraMercado.add("Negrita");
		marcasFueraMercado.add("MasterG");
		Utilidades.recorrerLista(marcasFueraMercado);

		int cantidad = marcasFueraMercado.size();
		System.out.println("7- Cantidad de marcas en la lista2: " + cantidad);
		System.out.println("--------------------------------------------------------------------");
		System.out.println("");

	}
}
