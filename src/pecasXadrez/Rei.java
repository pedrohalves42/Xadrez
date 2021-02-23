package pecasXadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.Cor;
import xadrez.PartidaXadrez;
import xadrez.PecaDeXadrez;

public class Rei extends PecaDeXadrez {

	public Rei(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean podeMove(Posicao posicao) {
		PecaDeXadrez p = (PecaDeXadrez) getTabuleiro().peca(posicao);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		getTabuleiro();
		getTabuleiro();
		boolean[][] mat = new boolean[Tabuleiro.getLinhas()][Tabuleiro.getColunas()];

		Posicao p = new Posicao(0, 0);

		// acima
		p.definirValores(posicao.getLinha() - 1, posicao.getColuna());
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// abaixo
		p.definirValores(posicao.getLinha() + 1, posicao.getColuna());
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// esquerda
		p.definirValores(posicao.getLinha(), posicao.getColuna() - 1);
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// direita
		p.definirValores(posicao.getLinha(), posicao.getColuna() + 1);
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// Nw
		p.definirValores(posicao.getLinha() - 1, posicao.getColuna() - 1);
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// NE
		p.definirValores(posicao.getLinha() - 1, posicao.getColuna() + 1);
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// SW
		p.definirValores(posicao.getLinha() + 1, posicao.getColuna() - 1);
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// Se
		p.definirValores(posicao.getLinha() + 1, posicao.getColuna() + 1);
		if (getTabuleiro().posExistente(p) && podeMove(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		return mat;
	}

}
