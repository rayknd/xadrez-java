package br.com.kennedy.chess.pieces;

import br.com.kennedy.boardgame.Board;
import br.com.kennedy.chess.ChessPiece;
import br.com.kennedy.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
