package factory;

import beans.*;

public class ChessElementFactory {

    public static ChessElement getChessElement(String elementType) {

        if(elementType.equalsIgnoreCase("King")){
            return new King();
        } else if(elementType.equalsIgnoreCase("Queen")){
            return new Queen();
        } else if(elementType.equalsIgnoreCase("Bishop")){
            return new Bishop();
        } else if(elementType.equalsIgnoreCase("Horse")){
            return new Horse();
        } else if(elementType.equalsIgnoreCase("Rook")){
            return new Rook();
        } else {
            return new Pawn();
        }

    }
}
