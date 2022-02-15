package com.generetion.animales;

public class Gato extends Animal implements Mascotas{

	@Override
	public void jugar() {
		System.out.println("Estoy jugando con cajas");
		
	}
	
	@Override
	public void correr() {
		System.out.println("Estoy persiguiendo una luz");
		
	}

	@Override
	public void baniar() {
		System.out.println("No me gusta el aguam :-(");
		
	}

}
