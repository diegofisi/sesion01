package sesion01;

import java.util.Scanner;

public class hola {

	public static void main(String[] args) {
		// imprime los mensaje
		System.out.println("Bienvenido al curso 2021");
		//captura los valores
		Scanner sc = new Scanner(System.in);

		System.out.println("¿cual es tu nombre?");

		String nombre = sc.nextLine();
		System.out.println("bienvenido " + nombre);

	}

}
