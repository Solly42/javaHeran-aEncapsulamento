package model;

public class Veiculos {

	private String marca;

	private String cor;

	private String tipo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void mostraInfo() {
		System.out.println("A marca do(a) " + tipo + " é " + this.marca);
		System.out.println("A cor do(a) " + tipo + " é " + this.cor);
	}

}
