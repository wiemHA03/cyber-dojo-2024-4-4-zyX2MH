
import java.util.List;

public class ChristmasSong {

    public static String createVerseHeader(int number) {
       List<String> dayList = List.of("first", "second", "third", "fourth", "fifth", "sixth","seventh", "eight", "ninth", "tenth", "eleventh", "twelfth");
        return "On the " + dayList.get(number - 1) + " day of Christmas\n" +
                "My true love gave to me:";
    
    }
    
      public static String createWholeVerse(int number) {
        List<String> lyricList = List.of("A partridge in a pear tree.", "Two turtle doves and", "Three french hens",
                                         "Four calling birds", "Five golden rings", "Six geese a-laying", "Seven swans a-swimming",
                                         "Eight maids a-milking", "Nine ladies dancing", "Ten lords a-leaping", "Eleven pipers piping", "Twelve drummers drumming");
        StringBuilder verse = new StringBuilder(createVerseHeader(number));
        for (int i = 1; i <= number; i++) {
            verse.append("\n");
            verse.append(lyricList.get(number - i));
        }
          return verse.toString();
    }
}
