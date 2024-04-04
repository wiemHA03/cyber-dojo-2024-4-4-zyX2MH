// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class ChristmasSongTest {
    
     @Test
    void test_header_of_first_verse() {
        String expected = "On the first day of Christmas\n" +
                "My true love gave to me:";
        String actual = ChristmasSong.createVerseHeader(1);
        assertEquals(expected, actual);
    }
    
      @Test
    void test_header_of_second_verse() {
        String expected = "On the second day of Christmas\n" +
                "My true love gave to me:";
        String actual = ChristmasSong.createVerseHeader(2);
        assertEquals(expected, actual);
    }
    
       
      @Test
    void test_whole_first_verse() {
        String expected = "On the first day of Christmas\n" +
                "My true love gave to me:\n"+
                 "A partridge in a pear tree.";
        String actual = ChristmasSong.createWholeVerse(1);
        assertEquals(expected, actual);
    }
    
        @Test
    void test_whole_second_verse() {
        String expected = "On the second day of Christmas\n" +
                "My true love gave to me:\n"+
                "Two turtle doves and\n" +
                 "A partridge in a pear tree.";
        String actual = ChristmasSong.createWholeVerse(2);
        assertEquals(expected, actual);
    }
    
        @Test
    void test_whole_third_verse() {
        String expected = "On the third day of Christmas\n" +
                "My true love gave to me:\n"+
                "Three french hens\n" +
                "Two turtle doves and\n" +
                 "A partridge in a pear tree.";
        String actual = ChristmasSong.createWholeVerse(3);
        assertEquals(expected, actual);
    }
}
