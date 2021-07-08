package ChessPieces;

import org.junit.jupiter.api.Test;

import static  org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PawnTest {

    @Test
    void shouldPawnBeInstantiatedReturnsNotNull(){
        Pawn pawn = new Pawn("black");

        assertThat(pawn,is(not(0)));
    }
    @Test
    void newInstantiatedPawnReturnsColor(){
        Pawn pawn = new Pawn("white");
        Pawn pawn2 = new Pawn("black");

        assertEquals("white", pawn.getColor());
        assertEquals("black", pawn2.getColor());

    }

    @Test
    void shouldNewPawnBeCreatedWhenHasNoGivenColor(){
        Pawn pawn = new Pawn();
        assertEquals("white", pawn.getColor());

    }
    @Test
    void newPawnCanHaveOnlyTwoColors(){
        Pawn pawn2;
        assertThrows(IllegalArgumentException.class, () ->new Pawn("red"));
    }
    @Test
    void shouldPawnBeRepresentedByALetter(){
        Pawn pawn = new Pawn();
        Pawn pawn2 = new Pawn("black");
        assertEquals("p", pawn.getRepresentation());
        assertEquals("P", pawn2.getRepresentation());
    }
}
