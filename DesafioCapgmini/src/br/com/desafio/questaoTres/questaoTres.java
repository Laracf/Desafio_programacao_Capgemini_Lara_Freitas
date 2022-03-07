package br.com.desafio.questaoTres;

import java.util.Scanner;

public class questaoTres {

	public static void main(String[] args) {

		var s = "Tenha um bom dia";

		/**
		 *  tira os espa�os em branco da String s.
		 */
		String tirarEspaco = s.replaceAll("\\s+", "");
		// System.out.println("Frase sem os espa�os em branco: " + tirarEspaco);

		/**
		 *  Contador de caracteres, fazendo a contagem dos caracteres da String s j� sem os espa�os em branco.
		 */ 
		var contar = tirarEspaco.replace(" ", "").length();
		// System.out.println("Quantidade de letras da frase sem os espa�os em branco: + contar);"
		

		/**
		 *  tira a raiz quadrada da quantidade de caracteres da String s sem os espa�os em branco.
		 */ 
		var raiz = Math.sqrt(contar);

		/**
		 *  Arredonda o valor da raiz.
		 */
		var raizA = (Math.round(raiz));
		// System.out.println("Raiz quadrada arredondada: " + raizA);

		String matriz[][] = { { "t", "e", "n", "h" }, { "a", "u", "m", "b" }, { "o", "m", "d", "i" }, { "a" } };

		Scanner teclado = new Scanner(System.in);

		/**
		 *  loop para imprimir as linhas e colunas da String matriz, o tamanho do loop �
		 *  definido pela variavel raizA, que � o valor da raiz quadrada do tamanho da
		 *  String s, sem os espa�os em branco e arredondada
		 */
		for (var linha = 0; linha < raizA - 1; linha++) {
			for (var coluna = 0; coluna < raizA - 1; coluna++) {

				/**
				 *  imprimi a frase, mas n�o estou conseguindo adequar o c�digo para aparecer
				 *  como mostra no exemplo do desafio, tentei colocar \t e \n junto com o %s, mas n�o adiantou
				 *  N�o sei se o erro est� na linha 32, em como o c�digo t� sendo imprimido ou
				 *  nas linhas 41 e 42,
				 *  na parte do c�digo "linha < raizA -1" e "coluna < raizA -1". 
				 */
				
				System.out.printf("%s", matriz[coluna][linha]);

				teclado.close();

			}

		}

	}

}
