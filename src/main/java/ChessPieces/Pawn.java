package ChessPieces;

import java.awt.*;

public class Pawn {

    private final String pawnColor;
    private  String representationLetter;

    public Pawn(){
        this.pawnColor = "white";
        setRepresentation("p");
    }
    public Pawn(String color){
        if (color.equals( "white") || color.equals( "black")){
            if(color.equals( "white")){
                setRepresentation("p");
            }else  {
                setRepresentation("P");
            }
            this.pawnColor = color;
        }else{
            throw   new IllegalArgumentException();

        }


    }



    public Object getColor() {
        return pawnColor;
    }
    private void setRepresentation(String letter){
        this.representationLetter = letter;
    }


    public String getRepresentation() {
        return representationLetter;
    }
}
