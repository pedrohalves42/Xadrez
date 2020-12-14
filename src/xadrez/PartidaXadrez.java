package xadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import pecasXadrez.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(9, 9);
		iniciaJogo();
	}

	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[Tabuleiro.getLinhas()][Tabuleiro.getColunas()];
		for (int i = 0; i < Tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < Tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}

		}
		return mat;
	}

	private void iniciaJogo() {
		tabuleiro.posicaoPeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(2, 1));
	}

}