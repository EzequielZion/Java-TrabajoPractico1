package t1.edu.ar;

import java.util.Scanner;

public class Ej7 {

	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		System.out.println("Ingrese una cantidad de manzanas");
		int CANTIDAD_MANZANAS_X_CAJON= input.nextInt();
		int resto= CANTIDAD_MANZANAS_X_CAJON % 8;
		int Division = CANTIDAD_MANZANAS_X_CAJON / 8;
		if (resto != 0)
		{
			Division++;
		}
		System.out.println("La cantidad de cajas necesarias es " +Division);

		
		

}
}