package t1.edu.ar;

import java.util.Scanner;

public class Ej6 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		System.out.println("Ingrese 3 n�meros");
		int num1= input.nextInt();
		int num2= input.nextInt();
		int num3= input.nextInt();
		if(num1== num2 && num2==num3)
		{
			System.out.println("Todos los n�meros son iguales");
		}
		else 
		{
			if(num1>=num2 && num1>=num3)
			{
			System.out.println("El n�mero m�s grande es num1");	
			}
			else if(num2>=num1 && num2>=num3)
			{
			System.out.println("El n�mero m�s grande es num2");	
			}
			else if(num3>=num1 && num3>=num2)
			{
				System.out.println("El n�mero m�s grande es num3");
			}
		}
		
		
		
	}

}
