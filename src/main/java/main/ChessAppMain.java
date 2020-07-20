package main;

import application.ChessApp;

public class ChessAppMain {


    public static void main(String[] args) throws Exception{
        System.out.println("Possible Moves for King At E3 are : "+ ChessApp.getThePossibleIndexesForGivenInput("King E3"));
        System.out.println("Possible Moves for Queen At E5 are : "+ ChessApp.getThePossibleIndexesForGivenInput("Queen E5"));
        System.out.println("Possible Moves for Bishop At E6 are : "+ ChessApp.getThePossibleIndexesForGivenInput("Bishop E6"));
        System.out.println("Possible Moves for Horse At E3 are : "+ ChessApp.getThePossibleIndexesForGivenInput("Horse E3"));
        System.out.println("Possible Moves for Rook At D4 are : "+ ChessApp.getThePossibleIndexesForGivenInput("Rook D4"));
        System.out.println("Possible Moves for Pawn At E6 are : "+ ChessApp.getThePossibleIndexesForGivenInput("Pawn E6"));

    }
}
