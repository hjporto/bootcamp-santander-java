package com.santander.bootcamp;

public class EstruturaLamba {

	public static void main(String[] args) {

		Calcular SOMA = (a, b) -> a + b;
		Calcular SUB = (a, b) -> a - b;
		Calcular MULT = (a, b) -> a * b;
		Calcular DIV = (a, b) -> a / b;

		System.out.println(SOMA.calcular(6, 3));// 9
		System.out.println(SUB.calcular(6, 3));// 3
		System.out.println(MULT.calcular(6, 3.5));// 21
		System.out.println(DIV.calcular(6, 3));// 2

	}

}

@FunctionalInterface
interface Calcular {
	public double calcular(double a, double b);
}
