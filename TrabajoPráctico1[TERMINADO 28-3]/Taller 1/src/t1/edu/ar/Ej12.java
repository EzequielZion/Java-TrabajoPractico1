package t1.edu.ar;

import java.util.Scanner;

public class Ej12 {

	private static Scanner input;
	
	public static void main(String[] args) {
		input=new Scanner(System.in);
		
		String Fecha;
		String NombreCliente;
		String NombreProducto;
		int Cantidad;
		int Precio;
		int PrecioAPagar;
		
		System.out.println("Bienvenido, ingrese la fecha de su compra");
		Fecha = input.nextLine();
		
		System.out.println("Ahora, ingrese su nombre");
		NombreCliente = input.nextLine();
		
		System.out.println("Ingrese el nombre del producto");
		NombreProducto = input.nextLine();
		
		System.out.println("Ingrese la cantidad que compró del producto");
		Cantidad = input.nextInt();
		if (Cantidad > 0)
		{
			System.out.println("Finalmente, ingrese el precio unitario del producto");
			Precio = input.nextInt();
			if (Precio > 0)
			{
				int Total = Precio * Cantidad;
				System.out.println("Fecha de compra: " + Fecha + ".\n"
									+ "Nombre del comprador: " + NombreCliente + ".\n"
									+ "Producto solicitado: " + NombreProducto +  ".\n"
									+ "Cantidad solicitada: " + Cantidad + ".\n"
									+ "Precio unitario: $" + Precio + ".\n"
									+ "Total a pagar: $" + Total + ".");
			}
			else
			{
				System.out.println("Error, ha ingresado un precio negativo");
			}
		}
		else
		{
			System.out.println("Error, ha ingresado una cantidad negativa");
		}

	}

}
