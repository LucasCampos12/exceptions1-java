package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	public void decreaseMoveCount() {
		moveCount--;
	}

//metodo que recebe a posicao do xadrez	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

//verifica se a peca inimiga paraa possivel captura	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		// verifica se a cor da peca eh diferente da minha, ou seja uma peça inimiga
		return p != null && p.getColor() != color;
	}

}
