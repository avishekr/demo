import java.util.stream.Collectors;

public class StringUtils {

    public static String encode(int offset, String str) {
        return str.chars()
                .mapToObj(c -> String.valueOf((char) (calculateDecimalValue(c, offset))))
                .collect(Collectors.joining());

    }

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
