import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;


public class ChessBoardTest {
    ChessBoard chessboard;

    @BeforeEach
    void setup(){
        chessboard =  new ChessBoard();

    }

    @Test
    void shouldChessboardBeInstantiated(){


        assertThat(chessboard,is(not(0)));

    }
    @Test
    void shouldChessboardBeCreatedNoPiecesAreOnIt(){

        assertThat(chessboard.getPieces().size(),is(0));

    }
    @Test
    void shouldPiecesCountGrowWhenPieceIsAdded(){
        chessboard.addPiece(new Pawn());

        assertThat(chessboard.getPieces().size(),greaterThan(0));

    }
    @Disabled
    /*@ParameterizedTest
    @MethodSource("createPiecesFOrBoard")
    void shouldAddingPiecesIncrementGetPieces(String color){
        assertThat(color, equals("black"));
        assertThat(color, equals("white"));
        assertThat(color, equals("black"));


    }*/
    private static Stream<Arguments> createPiecesFOrBoard(){
        return Stream.of(
                Arguments.of("black"),
                Arguments.of("white"),
                Arguments.of("black")
        );
    }

}
