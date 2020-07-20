package service;

import application.ChessApp;
import beans.ChessElement;
import factory.ChessElementFactory;

import java.util.HashMap;
import java.util.Map;

public class ChessService {

    private static final String INDEX_I = "INDEX_I";
    private static final String INDEX_J = "INDEX_J";

    public static String getAllPossibleIndexes(String elementType, String elementPosition){
        ChessElement chessElement = ChessElementFactory.getChessElement(elementType);
        Map<String, Integer> indexMap = getIndexOfElementFromChessBoard(elementPosition);
        return chessElement.getAllPossibleMovements(indexMap.get(INDEX_I), indexMap.get(INDEX_J));
    }

    private static Map<String, Integer> getIndexOfElementFromChessBoard(String elementPosition){
        Map<String, Integer> indexMap = new HashMap<>();
        for (int i =0; i<=7; i++) {
            for (int j = 0; j <= 7; j++) {
                String element = ChessApp.chessIndexes[i][j];
                if(element.equalsIgnoreCase(elementPosition)){
                    indexMap.put(INDEX_I, i);
                    indexMap.put(INDEX_J, j);
                }
            }
        }
        return indexMap;
    }
}
