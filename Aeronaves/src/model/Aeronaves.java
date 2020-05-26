package model;

public class Aeronaves {

	private String modelo;

	private float tamanho;

	private String cor;

	private int ano;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void voar() {
		System.out.println("A aeronave de modelo " + this.modelo + " está voando!");
	}

	public void pousar() {
		System.out.println("A aeronave de modelo " + this.modelo + " está pousando!");
	}

	public void parado() {
		System.out.println("A aeronave de modelo " + this.modelo + " está parada!");
	}

}
