package model;

public class Carro extends Veiculos {
	private int quantidadeRodas;

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	
	public void marca () {
		System.out.println("O carro é da marca " + getMarca());
	}
}
