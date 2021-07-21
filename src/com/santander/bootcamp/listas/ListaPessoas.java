package com.santander.bootcamp.listas;

public class ListaPessoas {
	private String nome;
	private Integer identificador;
	private Double altura;

	public ListaPessoas(String nome, Integer identificador, Double altura) {
		this.nome = nome;
		this.identificador = identificador;
		this.altura = altura;
	}

	public void imprimir() {
		System.out.println("Nome: " + nome + ", Documento: " + ", Altura: " + altura);
	}
}