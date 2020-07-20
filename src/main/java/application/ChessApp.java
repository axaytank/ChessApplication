package application;

import service.ChessService;
import validator.ChessValidator;

import java.util.ArrayList;
import java.util.Arrays;

public class ChessApp {

    public static String[][] chessIndexes = new String[8][8];

    static {
        initializeTheMatrix(chessIndexes);
    }

    private static void initializeTheMatrix(String chessIndexes[][]){
        Integer digitIndex = new Integer(8);
        for (int i =0 ; i<=7; i++){
            int charAscii = 65;
            for (int j=0;j <=7; j++){
                char c = (char) charAscii;
                String matrixValue = new Character(c).toString() +digitIndex.toString();
                chessIndexes[i][j] = matrixValue;
                charAscii++;
            }
            digitIndex--;
        }
    }

    public static String getThePossibleIndexesForGivenInput(String input) throws Exception {

        ChessValidator.validateInputString(input);
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(input.split(" ")));
        return ChessService.getAllPossibleIndexes(list.get(0), list.get(1));

    }

}

