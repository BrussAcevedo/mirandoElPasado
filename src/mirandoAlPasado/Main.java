package mirandoAlPasado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Main programa = new Main();

		boolean estado = false;
		
		
		do {
			
			System.out.println("1- Mostrar resultado ejercicio 1.");
			System.out.println("2- Mostrar resultado ejercicio 2.");
			System.out.println("3- Mostrar resultado ejercicio 3.");
			System.out.println("4- Mostrar resultado ejercicio 4.");
			System.out.println("5- Para salir.");
			System.out.println("Ingrese un valor: ");
			
			String resultadoStr = scan.nextLine();
			
			
			if (resultadoStr.matches("\\d+")) {
				int resultado = Integer.parseInt(resultadoStr);
				
				
				switch (resultado) {
				case 1: {
					Ejercicio1.resultadoEjercicio1();
					programa.presioneEnter();
					break;
					
				}
				case 2: {
					Ejercicio2.resultadoEjercicio2();
					programa.presioneEnter();
					break;
				}
				case 3: {
					Ejercicio3.resultadoEjercicio3();
					programa.presioneEnter();
					break;
				}
				case 4: {
					Ejercicio4.resultadoEjercicio4();
					programa.presioneEnter();
					break;
				}
				case 5: {
					estado = false;
					break;
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + resultado);
				}
			}else {
				System.out.println("Datos de entrada no validos");
			}
			
			
	
			
			
		
		}	while (estado = true);
			
	
	}
	
	
	
	public void presioneEnter() {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("Presione Enter para continuar:");
		scan.nextLine();
	}
	
	

}
