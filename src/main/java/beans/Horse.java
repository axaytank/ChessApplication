package beans;

import application.ChessApp;

import java.util.ArrayList;
import java.util.List;

public class Horse extends ChessElement {

    public String getAllPossibleMovements(int indexI, int indexJ){
        ArrayList<String> allIndexes = new ArrayList<>();

        checkHorizontalForwardIndexes(allIndexes, indexI, indexJ);
        checkHorizontalBackwardIndexes(allIndexes, indexI, indexJ);
        checkVerticalForwardIndexes(allIndexes, indexI, indexJ);
        checkVerticalBackwardIndexes(allIndexes, indexI, indexJ);

        return allIndexes.toString();
    }

    public  void checkHorizontalForwardIndexes(List<String> possibleIndexes, int indexI, int indexJ){
        int counterForMovableSteps = 1;

        for (int j= indexJ+1; j <=7 ; j++){
            if(counterForMovableSteps <= 2) {
                counterForMovableSteps++;
                indexJ = j;
            }
        }

        if(counterForMovableSteps >=2 ){

            int upperIndex = indexI -1;
            int lowerIndex = indexI + 1;
            if(upperIndex >= 0){
                possibleIndexes.add(ChessApp.chessIndexes[upperIndex][indexJ]);
            }
            if(lowerIndex <= 7){
                possibleIndexes.add(ChessApp.chessIndexes[lowerIndex][indexJ]);
            }
        }

    }

    private static void checkHorizontalBackwardIndexes(List<String> possibleIndexes, int indexI, int indexJ){
        int counterForMovableSteps = 1;
        for (int j= indexJ-1; j>=0; j--){
            if(counterForMovableSteps <= 2) {
                counterForMovableSteps++;
                indexJ = j;
            }

        }
        if(counterForMovableSteps >=2 ){

            int upperIndex = indexI -1;
            int lowerIndex = indexI + 1;
            if(upperIndex >= 0){
                possibleIndexes.add(ChessApp.chessIndexes[upperIndex][indexJ]);
            }
            if(lowerIndex <= 7){
                possibleIndexes.add(ChessApp.chessIndexes[lowerIndex][indexJ]);
            }
        }
    }

    private static void checkVerticalForwardIndexes(List<String> possibleIndexes, int indexI, int indexJ){
        int counterForMovableSteps = 1;
        for (int i= indexI+1; i <=7 ; i++){
            if(counterForMovableSteps <= 2) {
                counterForMovableSteps++;
                indexI = i;
            }
        }

        if(counterForMovableSteps >=2 ){

            int leftIndex = indexJ -1;
            int rightIndex = indexJ + 1;
            if(leftIndex >= 0){
                possibleIndexes.add(ChessApp.chessIndexes[indexI][leftIndex]);
            }
            if(rightIndex <= 7){
                possibleIndexes.add(ChessApp.chessIndexes[indexI][rightIndex]);
            }
        }

    }

    private static void checkVerticalBackwardIndexes(List<String> possibleIndexes, int indexI, int indexJ){
        int counterForMovableSteps = 1;
        for (int i= indexI-1; i>=0; i--){
            if(counterForMovableSteps <= 2) {
                counterForMovableSteps++;
                indexI = i;
            }
        }

        if(counterForMovableSteps >=2 ){

            int leftIndex = indexJ -1;
            int rightIndex = indexJ + 1;
            if(leftIndex >= 0){
                possibleIndexes.add(ChessApp.chessIndexes[indexI][leftIndex]);
            }
            if(rightIndex <= 7){
                possibleIndexes.add(ChessApp.chessIndexes[indexI][rightIndex]);
            }
        }
    }

}
