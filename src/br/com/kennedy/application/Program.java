package br.com.kennedy.application;

import br.com.kennedy.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		//Respons�vel exibir o tabuleiro
		UI.printBoard(chessMatch.getPieces());
	}

}
