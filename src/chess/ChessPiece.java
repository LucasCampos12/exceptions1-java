package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
//verifica se a peca inimiga paraa possivel captura	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		//verifica se a cor da peca eh diferente da minha, ou seja uma peça inimiga
		return p != null && p.getColor() != color;
	}
	
}
