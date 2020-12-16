package aplicacao;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoXadrez;

public class Xadrez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();

		while (true) {
			UI.printtabuleiro(partidaXadrez.getPecas());
			System.out.println();
			System.out.println("Origem : ");
			PosicaoXadrez origem = UI.lerPosicaoXadrez(sc);
			System.out.println();
			System.out.println("Destino : ");
			PosicaoXadrez destino = UI.lerPosicaoXadrez(sc);

			PecaDeXadrez capturaPeca = partidaXadrez.perfomaceMovimentoXadrez(origem, destino);

		}

	}

}
