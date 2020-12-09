package aplicacao;


import xadrez.PartidaXadrez;

public class Xadrez {

	public static void main(String[] args) {

		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.printtabuleiro(partidaXadrez.getpecas());
	}

}
