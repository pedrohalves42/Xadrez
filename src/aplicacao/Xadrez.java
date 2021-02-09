package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.PecaDeXadrez;
import xadrez.PosicaoXadrez;
import xadrez.XadrezExcessao;

public class Xadrez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PartidaXadrez partidaXadrez = new PartidaXadrez();

		while (true) {
			try {
				UI.clearScreen();
				UI.printtabuleiro(partidaXadrez.getPecas());
				System.out.println();
				System.out.println("Origem : ");
				PosicaoXadrez origem = UI.lerPosicaoXadrez(sc);
				System.out.println();
				System.out.println("Destino : ");
				PosicaoXadrez destino = UI.lerPosicaoXadrez(sc);

				PecaDeXadrez capturaPeca = partidaXadrez.perfomaceMovimentoXadrez(origem, destino);
			} catch (XadrezExcessao e) {
				System.out.println(e.getMessage());
				sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}

		}

	}
}
