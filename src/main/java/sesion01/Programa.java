package sesion01;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// creando una instancia de cuenta
		Cuenta cuenta;

		System.out.println("Ingrese numero de cuenta");
		String numeroCuenta = sc.nextLine();

		System.out.println("ingrese el titular de la cuenta");
		String titular = sc.nextLine();

		System.out.println("¿desea realizar un desposito inicial (y/n)?");
		char respuesta = sc.nextLine().charAt(0);
		if (respuesta == 'y') {
			System.out.println("ingrese el valor de deposito inicial");
			double monto = sc.nextDouble();

			cuenta = new Cuenta(numeroCuenta, titular, monto);
		} else {
			cuenta = new Cuenta(numeroCuenta, titular);
		}
		System.out.println("datos de la cuenta");
		System.out.println(cuenta);
	}
}
