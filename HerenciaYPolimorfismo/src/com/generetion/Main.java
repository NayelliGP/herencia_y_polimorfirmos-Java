package com.generetion;

public class Main {

	public static void main(String[] args) {
		//Herencia: cuando una clase hereda de otra, est� tiene acceso a sus atributos y
		//m�todos
		
		Cuadrado cuadrado1 = new Cuadrado();
		//cuadrado1.setNombre("Cuadrado");
		//System.out.println(cuadrado1.getNombre());
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(10);
		System.out.println("El �rea del " + cuadrado1.getNombre() + "es "
							+ cuadrado1.calcularArea());
		
		
		Triangulo triangulo1 = new Triangulo();
		//triangulo1.setNombre("Triangulo");
		//System.out.println(triangulo1.getNombre());
		triangulo1.setAlto(10);
		triangulo1.setLargo(15);
		System.out.println("El �rea del " + triangulo1.getNombre() + "es "
				+ triangulo1.calcularArea());
		

	}

}
