package t1.edu.ar;

import java.util.Scanner;

public class Ej11 {

	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		
		System.out.println("Ingrese dos n�meros enteros");
		int num1=input.nextInt();
		int num2=input.nextInt();
		boolean sonIguales=false;
		
		if (num1 == num2)
		{
			sonIguales=true;
			
		}else
		{
			sonIguales=false;
		}
		
		if (sonIguales==true)
		{
		
			System.out.println("Los n�meros son iguales");
		}	
		
		else
		{		
			System.out.println("Los n�meros no son iguales");
	}

}

}