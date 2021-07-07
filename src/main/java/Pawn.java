import java.awt.*;

public class Pawn {

    private final String pawnColor;

    public Pawn(){
        this.pawnColor = "white";
    }
    public Pawn(String color){
        this.pawnColor = color;

    }



    public Object getColor() {
        return pawnColor;
    }
}
