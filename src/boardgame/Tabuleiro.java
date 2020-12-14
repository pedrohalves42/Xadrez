package boardgame;

public class Tabuleiro {
	private static int linhas;
	private static int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException(
					"Erro ao criar tabuleiro: precisa ter pelo menos uma(1) linha e uma(1) coluna ");
		}
		Tabuleiro.linhas = linhas;
		Tabuleiro.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public static int getLinhas() {
		return linhas;
	}

	public static int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!posExistente(linha, coluna)) {
			throw new TabuleiroException(" Não possui posição no tabuleiro ");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!posExistente(posicao)) {
			throw new TabuleiroException(" Não possui posição no tabuleiro ");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void posicaoPeca(Peca peca, Posicao posicao) {
		if (haUmaPeca(posicao)) {
			throw new TabuleiroException("Já possui uma peça na posição do tabuleiro ");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean posExistente(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean posExistente(Posicao posicao) {
		return posExistente(posicao.getLinha(), posicao.getColuna());
	}

	public boolean haUmaPeca(Posicao posicao) {
		if (!posExistente(posicao)) {
			throw new TabuleiroException(" Não possui posição no tabuleiro ");
		}
		return peca(posicao) != null;
	}
}
