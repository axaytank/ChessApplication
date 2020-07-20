package validator;

import java.util.ArrayList;
import java.util.Arrays;

public class ChessValidator {

    private static final String BEAN_PACKAGE_NAME = "beans";

    public static void validateInputString(String input) throws Exception {

        if (null != input && input.length() >= 0) {
            ArrayList<String> list = new ArrayList<String>(Arrays.asList(input.split(" ")));
            String elementType = list.get(0);
            String indexPosition = list.get(1);
            String fullyQualifiedClassName = BEAN_PACKAGE_NAME + "." + elementType.substring(0, 1).toUpperCase() + elementType.substring(1);

            try {
                Class.forName(fullyQualifiedClassName);
            } catch (Exception e) {
                throw new Exception("Element " + elementType + " is an invalid input");
            }

            if (!indexPosition.matches("^[a-hA-H1-8]*$")) {
                throw new Exception("Index " + indexPosition + " is an invalid input");
            }
        } else {
            throw new Exception("Enter A Valid Input String like : 'King A1'");
        }
    }
}
