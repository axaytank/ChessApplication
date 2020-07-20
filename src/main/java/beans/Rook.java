package beans;

import java.util.ArrayList;

public class Rook extends ChessElement{

    public static final Integer MOVABLE_STEPS = 8;

    public String getAllPossibleMovements(int indexI, int indexJ){
        ArrayList<String> allIndexes = new ArrayList<>();
        allIndexes.addAll(super.checkHorizontalForwardIndexes(indexI, indexJ, MOVABLE_STEPS));
        allIndexes.addAll(super.checkHorizontalBackwardIndexes(indexI, indexJ, MOVABLE_STEPS));
        allIndexes.addAll(super.checkVerticalForwardIndexes(indexI, indexJ, MOVABLE_STEPS));
        allIndexes.addAll(super.checkVerticalBackwardIndexes(indexI, indexJ, MOVABLE_STEPS));
        return allIndexes.toString();
    }

}
