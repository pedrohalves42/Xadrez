package xadrez;

import boardgame.Peca;
import boardgame.Posicao;
import boardgame.Tabuleiro;

public abstract class PecaDeXadrez extends Peca {

	private Cor color;

	public PecaDeXadrez(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro);
		this.color = color;
	}

	public Cor getColor() {
		return color;
	}


}
