package br.com.desafio.questaoDois;

public class questaoDois {

	public static void main(String[] args) {
		/**
		 * 
		 */
		int[] num = { 1, 5, 3, 4, 2 };
		int x = 2;
		int nPares = 0;

		/**
		 * loop para percorrer todos os valores do vetor num
		 * os dois loop v�o percorrer o vetor e a partir do c�lculo descobrir as subtra��es que s�o o valor de x
		 */
		for (int i = 0; i < num.length; i++) {
			int e = num[i];
			for (int j = 0; j < num.length; j++) {
				int r = num[j];

				int calc = e - r;
				
				/**
				 * se o c�lculo da subtra��o der o valor de x 
				 * ent�o imprimir na tela a quantidade de vezes que o valor foi encontrad
				 */
				
				if (calc == x && calc > 0) {
					nPares++;

					System.out.println(nPares);
				}

			}

		}
	}
}
