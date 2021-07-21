package com.santander.bootcamp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {

	public static void main(String[] args) {
		String[] nomes = { "João", "Paulo", "Oliveira", "Ana", "Paula", "Maria" };
		Integer[] numeros = { 1, 2, 3, 4, 5 };
		ImprimirNomesFiltrados(nomes);
		ImprimirDobroDosNumeros(numeros);

	}

	public static void ImprimirNomesFiltrados(String... nomes) {
		//////////////////////////////////////
		//// String... = String[];
		////////////////////////////////////
		String nomesParaImprimir = " ";

		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("João")) {
				nomesParaImprimir += " " + nomes[i];
			}
		}
		System.out.println("Nomes do For: " + nomesParaImprimir);

		String nomesParaImprimirDaStream = Stream.of(nomes).filter(nome -> nome.equals("João"))
				.collect(Collectors.joining());
		System.out.println(nomesParaImprimirDaStream);
	}

	public static void ImprimirDobroDosNumeros(Integer... numeros) {
		for (Integer dobro : numeros) {
			System.out.println(dobro * 2);
		}
		System.out.println();
		System.out.println("Numeros da Stream: ");
		Stream.of(numeros).map(numero -> numero * 2).forEach(System.out::println);

	}

}