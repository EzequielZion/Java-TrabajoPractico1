package t1.edu.ar;

import java.util.Scanner;

public class Ej5 {
	
	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		System.out.println("Ingrese un número");
		float num1= input.nextFloat();
		System.out.println("Ingrese otro número");
		float num2= input.nextFloat();
		if(num2==0){
			System.out.println("No se puede dividir por cero");
		}
		else{
			float div= num1/num2;
			System.out.println(num1+" / " +num2+ " = " +div);
		}
		input.close();
	}

}
