package aplicacao;

import xadrez.PecaDeXadrez;

public class UI {
	public static void printtabuleiro(PecaDeXadrez[][] pecas) {
		for (int i = 0; i < pecas.length -1 ; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pecas.length -1; j++) {
				printPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h " );
	}

	private static void printPeca(PecaDeXadrez peca) {
		if (peca == null) {
			System.out.print("-");
		} else {
			System.out.print(peca);
		}
		System.out.println(" ");
	}
}
