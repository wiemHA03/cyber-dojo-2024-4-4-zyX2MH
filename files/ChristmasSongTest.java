// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ChristmasSongTest {
    
     @Test
    void test_two_lines_of_first_verse() {
        String expected = "On the first day of Christmas\n" +
                "My true love gave to me:";
        String actual = ChristmasSong.createVerseHeader(1);
        assertEquals(expected, actual);
    }
}
