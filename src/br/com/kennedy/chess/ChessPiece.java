package br.com.kennedy.chess;

import br.com.kennedy.boardgame.Board;
import br.com.kennedy.boardgame.Piece;
import br.com.kennedy.boardgame.Position;

public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color; 
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
}
