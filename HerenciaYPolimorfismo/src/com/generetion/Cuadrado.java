package com.generetion;

			//clase hija
						//de dode esta heredado
public class  Cuadrado extends FiguraGeometrica{ 
	
	public Cuadrado() {
		super("Cuadrado");
		//super();
		//constructo padre
		//System.out.println("constructor hijo");
		
	}

	@Override
	public float calcularArea() {
		return getAlto() * getLargo();

	}

	@Override
	public float perimetro() {
		return (getAlto() + getLargo()) *2;

	}
	
	
	
}
