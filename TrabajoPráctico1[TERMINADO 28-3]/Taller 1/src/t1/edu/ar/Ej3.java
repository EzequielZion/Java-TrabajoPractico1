package t1.edu.ar;

import java.util.Scanner;

public class Ej3 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Escriba su nombre");
		String nombre=input.nextLine();
		System.out.println("Bienvenido "+nombre);
		input.close();
	
	}

}
