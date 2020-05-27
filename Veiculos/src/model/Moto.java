package model;

public class Moto extends Veiculos {
	private int ano;

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void cor () {
		System.out.println("A moto é da cor " + getCor());
	}
	
}
