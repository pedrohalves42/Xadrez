package boardgame;

public class Peca {
	protected Posicao posicao;
	protected Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	

}
