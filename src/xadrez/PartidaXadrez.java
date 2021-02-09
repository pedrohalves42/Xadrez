package xadrez;

import boardgame.Peca;
import boardgame.Posicao;
import boardgame.Tabuleiro;
import pecasXadrez.Rei;
import pecasXadrez.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;

	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciaJogo();
	}

	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[Tabuleiro.getLinhas()][Tabuleiro.getColunas()];
		for (int i = 0; i < Tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < Tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}

		}
		return mat;
	}

	public PecaDeXadrez perfomaceMovimentoXadrez(PosicaoXadrez posicaoOrigem, PosicaoXadrez posicaoDestino) {
		Posicao origem = posicaoOrigem.toPosicao();
		Posicao destino = posicaoDestino.toPosicao();
		validacaoposicao(origem);
		Peca capturaPeca = movimento(origem, destino);

		return (PecaDeXadrez) capturaPeca;
	}

	private Peca movimento(Posicao origem, Posicao destino) {
		Peca p = tabuleiro.removePeca(origem);
		Peca capturada = tabuleiro.removePeca(destino);
		tabuleiro.posicaoPeca(p, destino);
		return capturada;
	}

	private void validacaoposicao(Posicao posicao) {
		if (!tabuleiro.haUmaPeca(posicao)) {
			throw new XadrezExcessao("não ha nenhuma peça no local!! ");
		}
		if (tabuleiro.peca(posicao).podeMover()) {
			throw new XadrezExcessao("não há movimentos possíveis para a peça escolhida");
		}
	}

	private void coloqueNovaPeca(char coluna, int linha, PecaDeXadrez peca) {
		tabuleiro.posicaoPeca(peca, new PosicaoXadrez(coluna, linha).toPosicao());
	}

	private void iniciaJogo() {
		coloqueNovaPeca('b', 1, new Torre(tabuleiro, Cor.BLACK));
		coloqueNovaPeca('d', 2, new Torre(tabuleiro, Cor.BLACK));
		coloqueNovaPeca('e', 1, new Rei(tabuleiro, Cor.BLACK));

		coloqueNovaPeca('e', 8, new Rei(tabuleiro, Cor.WHITE));
		coloqueNovaPeca('c', 7, new Torre(tabuleiro, Cor.WHITE));
		coloqueNovaPeca('c', 8, new Torre(tabuleiro, Cor.WHITE));
	}

}