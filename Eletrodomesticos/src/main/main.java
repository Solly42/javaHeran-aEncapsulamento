package main;

import model.Eletrodomesticos;

public class main {
	
	public static void main(String[] args) {
		
		Eletrodomesticos eletrodomesticos = new Eletrodomesticos();
		
		eletrodomesticos.setTipo("Geladeira");
		eletrodomesticos.setMarca("Eletrolux");
		eletrodomesticos.setCor("Preta");
		eletrodomesticos.setPotencia(500);
		
		eletrodomesticos.ligar();
		eletrodomesticos.potencia();
		eletrodomesticos.desligar();
		
	}

}
