package pecasXadrez;

import boardgame.Posicao;
import boardgame.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez {

	public Torre(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro, color);

	}

	@Override
	public String toString() {
		return "T";
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		getTabuleiro();
		getTabuleiro();
		getTabuleiro();
		getTabuleiro();
		boolean[][] mat = new boolean[Tabuleiro.getLinhas()][Tabuleiro.getColunas()];
		Posicao p = new Posicao(0, 0);

		// acima
		p.definirValores(posicao.getLinha() - 1, posicao.getColuna());
		while (getTabuleiro().posExistente(p) && !getTabuleiro().haUmaPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() - 1);
		}
		if (getTabuleiro().posExistente(p) && haPecaOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// esquerda
		p.definirValores(posicao.getLinha(), posicao.getColuna() - 1);
		while (getTabuleiro().posExistente(p) && !getTabuleiro().haUmaPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() - 1);
		}
		if (getTabuleiro().posExistente(p) && haPecaOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// direita
		p.definirValores(posicao.getLinha(), posicao.getColuna() + 1);
		while (getTabuleiro().posExistente(p) && !getTabuleiro().haUmaPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setColuna(p.getColuna() + 1);
		}
		if (getTabuleiro().posExistente(p) && haPecaOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		// baixo
		p.definirValores(posicao.getLinha() + 1, posicao.getColuna());
		while (getTabuleiro().posExistente(p) && !getTabuleiro().haUmaPeca(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
			p.setLinha(p.getLinha() + 1);
		}
		if (getTabuleiro().posExistente(p) && haPecaOponente(p)) {
			mat[p.getLinha()][p.getColuna()] = true;
		}

		return mat;

	}

}
