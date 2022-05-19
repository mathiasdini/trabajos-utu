package mathiasdini.scannerdemo;

import mathiasdini.scannerdemo.entities.Auto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Auto auto = new Auto("MVD 1234");//instanciamos la clase Auto (creamos un Auto)
		
		auto.setMarca("Chevrolet");
		String marca = auto.getMarca();
		
		auto.setCantdadiDePuertas(4);
		auto.setColor("Rojo");
		auto.setKilometraje(20);
		
		int cantidaPuetas = auto.getCantdadiDePuertas();
		
		String mensajeAImprimirEnPantalla = "Matricula: "+auto.getMatricula()+", Marca: " + marca + ", color: " + auto.getColor() + ", cantidadPuertas: "+ cantidaPuetas;
		
		System.out.print(mensajeAImprimirEnPantalla);
		
		
		
	}

}
