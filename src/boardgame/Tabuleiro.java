package boardgame;

public class Tabuleiro {
	private static int linhas;
	private static int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		Tabuleiro.linhas = linhas;
		Tabuleiro.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public static int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		Tabuleiro.linhas = linhas;
	}

	public static int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		Tabuleiro.colunas = colunas;
	}

	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void posicaoPeca(Peca peca, Posicao posicao) {
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
}
