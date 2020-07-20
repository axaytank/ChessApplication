import application.ChessApp;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessAppTest {



    @Test
    public void simpleTest() throws Exception{
        Assert.assertEquals(ChessApp.getThePossibleIndexesForGivenInput("King E3"), buildExpectedIndexes("F3,D3,E2,E4,F4,D2,D4,F2"));
        Assert.assertEquals(ChessApp.getThePossibleIndexesForGivenInput("Queen E5"), buildExpectedIndexes("F5,G5,H5,D5,C5,B5,A5,E4,E3,E2,E1,E6,E7,E8,F6,G7,H8,D4,C3,B2,A1,D6,C7,B8,F4,G3,H2"));
        Assert.assertEquals(ChessApp.getThePossibleIndexesForGivenInput("Bishop E6"), buildExpectedIndexes("F7,G8,D5,C4,B3,A2,D7,C8,F5,G4,H3"));
        Assert.assertEquals(ChessApp.getThePossibleIndexesForGivenInput("Horse E3"), buildExpectedIndexes("G4,G2,C4,C2,D1,F1,D5,F5"));
        Assert.assertEquals(ChessApp.getThePossibleIndexesForGivenInput("Rook D4"), buildExpectedIndexes("E4,F4,G4,H4,C4,B4,A4,D3,D2,D1,D5,D6,D7,D8"));
        Assert.assertEquals(ChessApp.getThePossibleIndexesForGivenInput("Pawn E6"), buildExpectedIndexes("E7"));
    }

    public  String buildExpectedIndexes(String expectedIndex){
        List<String> expectedIndexesList = new ArrayList<String>();
        expectedIndexesList = Arrays.asList(expectedIndex.split(","));
        return  expectedIndexesList.toString();
    }
}
