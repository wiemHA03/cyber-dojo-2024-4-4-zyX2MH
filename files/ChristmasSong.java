
import java.util.List;

public class ChristmasSong {

    public static String createVerseHeader(int number) {
       List<String> dayList = List.of("first", "second", "third", "fourth", "fifth");
        return "On the " + dayList.get(number - 1) + " day of Christmas\n" +
                "My true love gave to me:";
    
    }
    
      public static String createWholeVerse(int number) {
        List<String> lyricList = List.of("A partridge in a pear tree.", "Two turtle doves and");
        StringBuilder verse = new StringBuilder(createVerseHeader(number));
        for (int i = 0; i <= number; i++) {
            verse.append("/n");
            verse.append(lyricList.get(number - i));
        }
          return verse;
    }
}
