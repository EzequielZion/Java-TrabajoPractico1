package t1.edu.ar;

import java.util.Scanner;

public class Ej4 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		System.out.println("Ingrese un número");
		int num1=input.nextInt();
		System.out.println("Ingrese otro número");
		int num2=input.nextInt();
		System.out.println("La suma entre "+num1+ " y " +num2+ " da como resultado " +num1 +num2);
		input.close();
		//El resultado es incorrecto porque al no poner la suma de las variables entre parentesis concatena
		//Solución: System.out.println("La suma entre "+num1+ " y " +num2+ " da como resultado " + (num1 +num2));
	}

}
