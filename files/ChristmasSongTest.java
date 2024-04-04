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
    
         @Test
    void test_whole_poem() {
        String expected = "On the first day of Christmas\n" +
                "My true love gave to me:\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the second day of Christmas\n" +
                "My true love gave to me:\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the third day of Christmas\n" +
                "My true love gave to me:\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the fourth day of Christmas\n" +
                "My true love gave to me:\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the fifth day of Christmas\n" +
                "My true love gave to me:\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the sixth day of Christmas,\n" +
                "My true love gave to me:\n" +
                "Six geese a-laying\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the seventh day of Christmas,\n" +
                "My true love gave to me:\n" +
                "Seven swans a-swimming\n" +
                "Six geese a-laying\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the eight day of Christmas,\n" +
                "My true love gave to me:\n" +
                "Eight maids a-milking\n" +
                "Seven swans a-swimming\n" +
                "Six geese a-laying\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the ninth day of Christmas,\n" +
                "My true love gave to me:\n" +
                "Nine ladies dancing\n" +
                "Eight maids a-milking\n" +
                "Seven swans a-swimming\n" +
                "Six geese a-laying\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the tenth day of Christmas,\n" +
                "My true love gave to me:\n" +
                "Ten lords a-leaping\n" +
                "Nine ladies dancing\n" +
                "Eight maids a-milking\n" +
                "Seven swans a-swimming\n" +
                "Six geese a-laying\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the eleventh day of Christmas,\n" +
                "My true love gave to me:\n" +
                "Eleven pipers piping\n" +
                "Ten lords a-leaping\n" +
                "Nine ladies dancing\n" +
                "Eight maids a-milking\n" +
                "Seven swans a-swimming\n" +
                "Six geese a-laying\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.\n" +
                "\n" +
                "On the twelfth day of Christmas,\n" +
                "My true love gave to me:\n" +
                "Twelve drummers drumming\n" +
                "Eleven pipers piping\n" +
                "Ten lords a-leaping\n" +
                "Nine ladies dancing\n" +
                "Eight maids a-milking\n" +
                "Seven swans a-swimming\n" +
                "Six geese a-laying\n" +
                "Five golden rings\n" +
                "Four calling birds\n" +
                "Three french hens\n" +
                "Two turtle doves and\n" +
                "A partridge in a pear tree.";
       
      
        StringBuilder poem = new StringBuilder();;
        for (int i = 1; i <= 11; i++) {
            poem.append(ChristmasSong.createWholeVerse(i)+"\n");
            poem.append("\n");
        }
        poem.append(ChristmasSong.createWholeVerse(12));
        assertEquals(expected, poem.toString());
    }
}
