import ChessPieces.Pawn;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard {
    private final int maxNumberOfPawns = 16;
    List<Pawn> boardPieces = new ArrayList<>();

    List<Pawn> getPieces (){
        return boardPieces;
    }

    public ChessBoard(){
        initializeBoard();
    }

    private void addPiece(Pawn pawn) {
        boardPieces.add(pawn);
    }
    public ArrayList<Pawn> initializeBoard(){
        for (int i = 0; i < maxNumberOfPawns/2; i++){
            addPiece(new Pawn());
            addPiece(new Pawn("black"));
        }


        return null;

    }
}
