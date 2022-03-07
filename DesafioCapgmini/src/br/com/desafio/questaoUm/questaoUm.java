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
		 * arruma os n�meros em ordem crescente
		 */
		Arrays.sort(num);

		/**
		 * f�rmula para achar o n�mero do meio do array �mpar.
		 */
		meio = (esq + dir) / 2;

		/**
		 * aplica a f�rmula para achar a mediana da matriz num
		 */
		mediana = num[meio];

		System.out.print("A mediana �: " + mediana);

	}

}
