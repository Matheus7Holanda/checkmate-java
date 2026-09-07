package boardgame;

public class Piece {
	
	protected Position position; // O acesso é por pacote e por herança
	private Board board;
	
	
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}



	protected Board getBoard() {
		return board;
	}
	
}
