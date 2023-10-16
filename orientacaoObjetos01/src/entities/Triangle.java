package entities;

public class Triangle {
	// atributos da classe
	public double a;
	public double b;
	public double c;
	// public significa atributo ou método podem ser usado em outro arquivo.
	// se o método não retorna nada, usa-se void. 
	// se ele retorna algo, se coloca o tipo do valor que é retornado.
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
