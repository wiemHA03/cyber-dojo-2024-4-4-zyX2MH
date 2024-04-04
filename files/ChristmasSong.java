
import java.util.List;

public class ChristmasSong {

    public static String createVerseHeader(int number) {
       List<String> dayList = List.of("first", "second", "third", "fourth", "fifth");
        return "On the " + dayList.get(number - 1) + " day of Christmas\n" +
                "My true love gave to me:";
    
    }
    
    public static String createWholeVerse(int number){
        List<String> lyricList = List.of("A partridge in a pear tree.","Two turtle doves and");
    return createVerseHeader(number) +"\n"+ lyricList.get(number - 1) + "\n"+ lyricList.get(number - 2);
    }
}
