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
        return 1;

    }
}
