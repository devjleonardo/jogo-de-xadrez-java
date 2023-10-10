package xadrez;

import tabuleiro.Tabuleiro;
import xadrez.enums.Cor;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartidaDeXadrezColocandoPecasNoTabuleiro();
	}
	
	public PecaDeXadrez[][] getPecasDeXadrezDaPartida() {
		PecaDeXadrez[][] pecasDeXadrez = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				pecasDeXadrez[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		
		return pecasDeXadrez;
	}
	
	private void colocarNovaPeca(char coluna, int linha, PecaDeXadrez pecaDeXadrez) {
		tabuleiro.colocarPeca(pecaDeXadrez, new PosicaoDeXadrez(coluna, linha).paraPosicao());
	}
	
	private void iniciarPartidaDeXadrezColocandoPecasNoTabuleiro() {
		colocarNovaPeca('c', 1, new Torre(tabuleiro, Cor.BRANCA));
		colocarNovaPeca('c', 2, new Torre(tabuleiro, Cor.BRANCA));
		colocarNovaPeca('d', 2, new Torre(tabuleiro, Cor.BRANCA));
		colocarNovaPeca('e', 2, new Torre(tabuleiro, Cor.BRANCA));
		colocarNovaPeca('e', 1, new Torre(tabuleiro, Cor.BRANCA));
		colocarNovaPeca('d', 1, new Rei(tabuleiro, Cor.BRANCA));

		colocarNovaPeca('c', 7, new Torre(tabuleiro, Cor.PRETA));
		colocarNovaPeca('c', 8, new Torre(tabuleiro, Cor.PRETA));
		colocarNovaPeca('d', 7, new Torre(tabuleiro, Cor.PRETA));
		colocarNovaPeca('e', 7, new Torre(tabuleiro, Cor.PRETA));
        colocarNovaPeca('e', 8, new Torre(tabuleiro, Cor.PRETA));
        colocarNovaPeca('d', 8, new Rei(tabuleiro, Cor.PRETA));
	}
	
}
