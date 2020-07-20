package beans;

import java.util.ArrayList;

public class Pawn extends ChessElement{

    public static final Integer MOVABLE_STEPS = 1;

    public String getAllPossibleMovements(int indexI, int indexJ){
        ArrayList<String> allIndexes = new ArrayList<>();
        allIndexes.addAll(super.checkVerticalBackwardIndexes(indexI, indexJ, MOVABLE_STEPS));
        return allIndexes.toString();
    }
}
