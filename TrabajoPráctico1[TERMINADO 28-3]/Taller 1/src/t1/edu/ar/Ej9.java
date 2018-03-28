package t1.edu.ar;

import java.util.Scanner;

public class Ej9 {

	private static Scanner input;

	public static void main(String[] args) {
		input=new Scanner(System.in);
		
		System.out.println("Ingrese un número entre 1 y 7 inclusive");
		int num=input.nextInt();
		String leyenda=("El día de la semana es ");
		
		if(num>7 || num<1)
		{
			System.out.println("El día ingresado no es válido");
		}
		
		switch(num)
		{
			case 1:System.out.println(leyenda+ "Domingo"); 
			break;
			case 2:System.out.println(leyenda+ "Lunes"); 
			break;
			case 3:System.out.println(leyenda+ "Martes"); 
			break;
			case 4:System.out.println(leyenda+ "Miercoles"); 
			break;
			case 5:System.out.println(leyenda+ "Jueves"); 
			break;
			case 6:System.out.println(leyenda+ "Viernes"); 
			break;
			case 7:System.out.println(leyenda+ "Sábado"); 
			break;
		}
	
	}

}
