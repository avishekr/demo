import junit.framework.TestCase;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class StringUtilsTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void Given_offsetEquals1_When_StringEqualsa_Then_resultIsb() {
        assertEquals(StringUtils.encode(1,"a"), "b");
    }
    
    @Test
    public void Given_offsetEqualsMinus1_When_StringEqualsa_Then_resultIsz() {
    	assertEquals(StringUtils.encode(-1,"a"), "z");
    }
    
    @Test
    public void Given_offsetEquals1_When_StringEqualsabc_Then_resultIsbcd() {
    	assertEquals(StringUtils.encode(1,"abc"), "bcd");
    }
    
    @Test
    public void Given_offsetEqualsMinus1_When_StringEqualsabc_Then_resultIszab() {
    	assertEquals(StringUtils.encode(-1,"abc"), "zab");
    }
    
    @Test
    public void throwsRuntimeExceptions_When_invalidStringIsPassed() {

    	exception.expect(RuntimeException.class);
    	StringUtils.encode(1,"123");
    }
}
