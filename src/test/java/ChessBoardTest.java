import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class ChessBoardTest {
    @Test
    void shouldChessboardBeInstantiated(){
        ChessBoard chessboard = new ChessBoard();

        assertThat(chessboard,is(not(0)));

    }
    @Test
    void shouldChessboardBeCreatedNoPiecesAreOnIt(){
        ChessBoard chessboard = new ChessBoard();

        assertThat(chessboard.getPieces().size(),is(0));

    }
}
