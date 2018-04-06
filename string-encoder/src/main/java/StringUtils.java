import java.util.stream.Collectors;

/*
 * This class contains the business logic of the character replacement of a string.
 */
public class StringUtils {

	/*
	 * This method encodes the characters 
	 * of the string both in forward as well as backward condition and returns the new string formed.
	 * @param offset This is supplied as 1 or -1 i.e. the index of the character of the String.
	 * @param str This is the input string.
	 * @return Returns the new String formed.
	 */
    public static String encode(int offset, String str) {
        return str.chars()
                .mapToObj(c -> String.valueOf((char) (calculateDecimalValue(c, offset))))
                .collect(Collectors.joining());

    }
    
    /*
     * This method calculates the ascii value of the character.
     * @param intVal This is the ascii value of the letter of the string.
     * @param offset This is the index of the letter.
     * @return Returns the ascii
     */
    private static int calculateDecimalValue(int intVal, int offset) {
        if (intVal < 97 || intVal > 122)
            throw new RuntimeException("Invalid String Passed");
        else if (intVal + offset == 123)
            return 97;
        else if (intVal + offset == 96)
            return 122;
        else return intVal + offset;

    }
}
