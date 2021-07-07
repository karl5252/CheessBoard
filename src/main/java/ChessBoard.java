import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    List<Pawn> boardPieces = new ArrayList<>();

    List<Pawn> getPieces (){
        return boardPieces;
    }

    public void addPiece(Pawn pawn) {
        boardPieces.add(pawn);
    }
}
