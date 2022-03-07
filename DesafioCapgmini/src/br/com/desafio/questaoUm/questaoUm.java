package br.com.desafio.questaoUm;

import java.util.Arrays;

public class questaoUm {

	public static void main(String[] args) {

		int[] num = { 9, 2, 1, 4, 6 };
		int mediana;
		int esq = 0;
		int dir = num.length - 1;
		int meio;

		/**
		 * arruma os números em ordem crescente
		 */
		Arrays.sort(num);

		/**
		 * fórmula para achar o número do meio do array ímpar.
		 */
		meio = (esq + dir) / 2;

		/**
		 * aplica a fórmula para achar a mediana da matriz num
		 */
		mediana = num[meio];

		System.out.print("A mediana é: " + mediana);

	}

}
