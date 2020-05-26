package model;

public class Eletrodomesticos {
	
	private String tipo;
	
	private String marca;
	
	private String cor;
	
	private int potencia;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

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

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	public void ligar() {
		System.out.println("A " + this.tipo + " está ligada!");
	}
	
	public void potencia() {
		System.out.println("A potencia da " + this.tipo + " é de: " + this.potencia + "W");
	}
	
	public void desligar() {
		System.out.println("A " + this.tipo + " foi desligada!");
	}
}
