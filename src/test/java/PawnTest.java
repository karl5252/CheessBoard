import org.junit.jupiter.api.Test;

import java.awt.*;

import static  org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PawnTest {

    @Test
    void shouldPawnBeInstantiatedReturnsNotNull(){
        Pawn pawn = new Pawn("white");

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
}
