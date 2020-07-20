package beans;

import application.ChessApp;

import java.util.ArrayList;

public abstract class ChessElement {

    public abstract String getAllPossibleMovements(int indexI, int indexJ);

    public  ArrayList<String> checkHorizontalForwardIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int counterForMovableSteps = 1;
        for (int j= indexJ+1; j <=7 ; j++){
            if(counterForMovableSteps <= movableSteps){
                possibleIndexes.add(ChessApp.chessIndexes[indexI][j]);
                counterForMovableSteps++;
            }
        }
        return possibleIndexes;
    }

    public  ArrayList<String> checkHorizontalBackwardIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int counterForMovableSteps = 1;
        for (int j= indexJ-1; j>=0; j--){
            if(counterForMovableSteps <= movableSteps) {
                possibleIndexes.add(ChessApp.chessIndexes[indexI][j]);
                counterForMovableSteps++;
            }
        }
        return possibleIndexes;
    }

    public  ArrayList<String> checkVerticalForwardIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int counterForMovableSteps = 1;
        for (int i= indexI+1; i <=7 ; i++){
            if(counterForMovableSteps <= movableSteps) {
                possibleIndexes.add(ChessApp.chessIndexes[i][indexJ]);
                counterForMovableSteps++;
            }
        }
        return  possibleIndexes;
    }

    public  ArrayList<String> checkVerticalBackwardIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int counterForMovableSteps = 1;
        for (int i= indexI-1; i>=0; i--){
            if(counterForMovableSteps <= movableSteps) {
                possibleIndexes.add(ChessApp.chessIndexes[i][indexJ]);
                counterForMovableSteps++;
            }
        }
        return possibleIndexes;
    }

    public  ArrayList<String> checkForwardDiagonalIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int actualIndexI = indexI-1;
        int actualIndexJ = indexJ+1;
        int counterForMovableSteps = 1;

        while(actualIndexI>=0 && actualIndexI<=7 && actualIndexJ>=0 && actualIndexJ<=7){
            if(counterForMovableSteps <= movableSteps) {
                possibleIndexes.add(ChessApp.chessIndexes[actualIndexI][actualIndexJ]);
                counterForMovableSteps++;
            }
            actualIndexI--;
            actualIndexJ++;
        }
        return possibleIndexes;
    }

    public  ArrayList<String> checkBackwardDiagonalIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int actualIndexI = indexI+1;
        int actualIndexJ = indexJ-1;
        int counterForMovableSteps = 1;

        while(actualIndexI>=0 && actualIndexI<=7 && actualIndexJ>=0 && actualIndexJ<=7){
            if(counterForMovableSteps <= movableSteps) {
                possibleIndexes.add(ChessApp.chessIndexes[actualIndexI][actualIndexJ]);
                counterForMovableSteps++;
            }
            actualIndexI++;
            actualIndexJ--;
        }
        return possibleIndexes;
    }

    public  ArrayList<String> checkRightSideForwardDiagonalIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int actualIndexI = indexI-1;
        int actualIndexJ = indexJ-1;
        int counterForMovableSteps = 1;

        while(actualIndexI>=0 && actualIndexI<=7 && actualIndexJ>=0 && actualIndexJ<=7){
            if(counterForMovableSteps <= movableSteps) {
                possibleIndexes.add(ChessApp.chessIndexes[actualIndexI][actualIndexJ]);
                counterForMovableSteps++;
            }
            actualIndexI--;
            actualIndexJ--;
        }
        return possibleIndexes;
    }

    public  ArrayList<String> checkRightSideBackwardDiagonalIndexes(int indexI, int indexJ, int movableSteps){
        ArrayList<String> possibleIndexes = new ArrayList<>();
        int actualIndexI = indexI+1;
        int actualIndexJ = indexJ+1;
        int counterForMovableSteps = 1;

        while(actualIndexI>=0 && actualIndexI<=7 && actualIndexJ>=0 && actualIndexJ<=7){
            if(counterForMovableSteps <= movableSteps) {
                possibleIndexes.add(ChessApp.chessIndexes[actualIndexI][actualIndexJ]);
                counterForMovableSteps++;
            }
            actualIndexI++;
            actualIndexJ++;
        }
        return possibleIndexes;
    }
}
