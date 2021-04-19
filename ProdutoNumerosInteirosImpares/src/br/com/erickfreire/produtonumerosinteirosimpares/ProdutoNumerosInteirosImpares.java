package br.com.erickfreire.produtonumerosinteirosimpares;

/**
 * Programa que calcula o produtos dos numeros inteiros de 1 a 15
 * @author Erick Freire
 * @version 1 - Criado em 09-04-2021 as 18:41
 */

public class ProdutoNumerosInteirosImpares {
	public static void main(String[] args) {
		int produto = 1;
		
		for(int i = 1; i <= 15; i++) {
			if(i % 2 == 1)
				produto *= i;
		}
		
		System.out.printf("O produto é de : %d", produto);
	}

}
