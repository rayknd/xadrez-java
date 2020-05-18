package br.com.kennedy.chess.pieces;

import br.com.kennedy.boardgame.Board;
import br.com.kennedy.chess.ChessPiece;
import br.com.kennedy.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K"; 
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}

}
