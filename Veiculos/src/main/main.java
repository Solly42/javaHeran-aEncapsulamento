package main;

import model.Carro;
import model.Moto;
import model.Veiculos;

public class main {

	public static void main(String[] args) {

		Veiculos veiculos = new Veiculos();

		veiculos.setMarca("Ford");
		veiculos.setCor("Vermelho");
		veiculos.setTipo("Carro");

		veiculos.mostraInfo();

		System.out.println("------------------------------------------");

		Moto moto = new Moto();
		moto.setTipo("moto");
		moto.setMarca("Honda");
		moto.setCor("Preta");
		moto.setAno(2020);

		moto.mostraInfo();

		System.out.println("------------------------------------------");

		Carro carro = new Carro();
		carro.setTipo("Carro");
		carro.setMarca("Gol");
		carro.setCor("Azul");
		carro.setQuantidadeRodas(4);

		carro.mostraInfo();
	}
}
