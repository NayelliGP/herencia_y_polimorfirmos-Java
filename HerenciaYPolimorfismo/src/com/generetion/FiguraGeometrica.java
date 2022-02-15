package com.generetion;

//super clase
public abstract class FiguraGeometrica {
	//Clases absatractas
		//La clase abstracta no puede crear objetos
		//Clases quepueden o no contener métodos abstractos
	 	//definir atributos y métodos para heredar, mas no utilizarlos
		//Puede o no tener metodos abstractos
	//Método abstracto es un método que te dice que hacer pero no te dice como hacerlo 

	private String nombre;
	protected float alto;
	protected float largo;
	
	/*public FiguraGeometrica() {
	}*/
	
	//Constructor
	public FiguraGeometrica(String nombre) {
		 //System.out.println("Consturctor padre");
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}


	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	//::::::::::::::::::::::Metodos Abstractos:::::::::::::::::
	public abstract float calcularArea();
	
	public abstract float perimetro();
	
}
