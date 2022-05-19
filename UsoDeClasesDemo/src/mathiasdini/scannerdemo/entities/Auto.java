package mathiasdini.scannerdemo.entities;

public class Auto {

	private String matricula;//identificador, es unico para cada instancia que se creee de Auto
	private String marca;
	private String color;
	private int cantdadiDePuertas;
	private int kilometraje;
	
	public Auto() {
	}

	public Auto(String matriculaPasadaPorParametro) {
		matricula = matriculaPasadaPorParametro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCantdadiDePuertas() {
		return cantdadiDePuertas;
	}

	public void setCantdadiDePuertas(int cantdadiDePuertas) {
		this.cantdadiDePuertas = cantdadiDePuertas;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	
}
