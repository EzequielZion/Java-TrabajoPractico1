package t1.edu.ar;

import java.util.Scanner;

public class Ej8 {

	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
        String nombre1= input.nextLine();
        System.out.println("Ingrese capital aportado");
		double num1=input.nextDouble();
		input.nextLine();

		System.out.println("Ingrese su nombre");
        String nombre2= input.nextLine();
        System.out.println("Ingrese capital aportado");
		double num2=input.nextDouble();
		input.nextLine();

		System.out.println("Ingrese su nombre");
        String nombre3= input.nextLine();
        System.out.println("Ingrese capital aportado");
		double num3=input.nextDouble();
		input.nextLine();
		
        double suma = num1 + num2 + num3;
		
		double porc1 = ((num1 / (double)suma) * 100);
		double porc2 = ((num2 / (double)suma) * 100);
		double porc3 = ((num3 / (double)suma) * 100);

		System.out.println(nombre1+ " aportó: $ " +num1);
		System.out.println(" El porcentaje de lo aportado es: % " +porc1);
	
		System.out.println(nombre2+ " aportó: $ " +num2);
		System.out.println(" El porcentaje de lo aportado es: % " +porc2);

		System.out.println(nombre3+ " aportó: $ " +num3);
		System.out.println(" El porcentaje de lo aportado es: % " +porc3);

	}

}
