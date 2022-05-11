package br.fepi.sistemas.lab11;

/**
 * Classe que implementa métodos para calculos matemáticos.
 * @author Leandro Duarte
 * 
 */
public class Matematica {
	
	private int m;
	private double s;
	
	/**
	 * @param n1
	 * @param n2
	 * @return Maior valor
	 */
	public int maior(int n1, int n2){
		if (n1 > n2)
			m = n1;
		else m = n2;
		return m;
		}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return Soma
	 */
	public double soma(double n1, double n2){
		return (n1 + n2);
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return Divisão
	 */
	public double divisao(double n1, double n2){
		return (n1 / n2);
	}
	
	/**
	 * 
	 * @param n1
	 * @return Se número é par ou impar.
	 */
	public String parImpar (int n1) {
		return n1 % 2 == 0 ? "Par": "Impar";
	}
	
}
