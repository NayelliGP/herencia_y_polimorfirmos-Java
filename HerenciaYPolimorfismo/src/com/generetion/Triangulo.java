package com.generetion;

public class Triangulo extends FiguraGeometrica{
	
	public Triangulo() {
		super("Triangulo");
		//super();
		//System.out.println("constructor hijo");
	}
	
	//Poliformismo
	@Override //metodo de anilación
	public float calcularArea() {
		//return (alto * largo) / 2;
		return (getAlto() * getLargo()) / 2; //de esta manaera queda privado de nuevo
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
