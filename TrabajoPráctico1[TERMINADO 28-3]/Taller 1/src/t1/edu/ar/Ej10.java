package t1.edu.ar;

import java.util.Scanner;

public class Ej10 {

	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero entero mayor a 0");
		int num1=input.nextInt();
		
		if(num1<=0){
			System.out.println("El n�mero no es v�lido");
		}
		
		else
		{
		
		int resto=num1%2;
		
		if (resto == 0)
		{
			System.out.println("El n�mero es par");
			
		}
		
		else
		{
			System.out.println("El n�mero es impar");
			
		}
		
	}

}
	
}
