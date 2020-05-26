package main;

import model.Aeronaves;

public class main {

	public static void main(String[] args) {

		Aeronaves aeronaves = new Aeronaves();

		aeronaves.setModelo("A19");
		aeronaves.setTamanho(70);
		aeronaves.setCor("Branco");
		aeronaves.setAno(2020);

		aeronaves.voar();
		aeronaves.pousar();
		aeronaves.parado();

	}

}
