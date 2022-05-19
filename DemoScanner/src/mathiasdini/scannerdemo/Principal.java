package mathiasdini.scannerdemo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.print("Escriba algo: ");
		
		Scanner in = new Scanner(System.in);
		
		String nombreProducto = in.next();

		in.close();
		
		String mensaje = "Usted escribió: " + nombreProducto;
		
		System.out.println(mensaje);//println imprime y deja un salto de linea, print imprime y NO deja un salto de linea
		
	}

}
