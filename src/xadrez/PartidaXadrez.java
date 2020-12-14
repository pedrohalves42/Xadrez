package xadrez;

import boardgame.Tabuleiro;
import pecasXadrez.Rei;
import pecasXadrez.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
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

	private void coloqueNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.posicaoPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}

	private void iniciaJogo() {
		coloqueNovaPeca('b', 6, new Torre(tabuleiro, Cor.BLACK));
		coloqueNovaPeca('e', 8, new Rei(tabuleiro, Cor.WHITE));
		coloqueNovaPeca('e', 1	, new Rei(tabuleiro, Cor.BLACK));
	}

}