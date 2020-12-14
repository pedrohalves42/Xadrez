package pecasXadrez;

import boardgame.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaDeXadrez;

public class Torre extends PecaDeXadrez{

	public Torre(Tabuleiro tabuleiro, Cor color) {
		super(tabuleiro, color);
		
	}

	@Override
	public String toString() {
		return "T";
	}

}
