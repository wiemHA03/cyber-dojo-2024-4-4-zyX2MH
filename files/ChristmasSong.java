
import java.util.List;

public class ChristmasSong {

    public static String createVerseHeader(int number) {
       List<String> dayList = List.of("first", "second", "third", "fourth", "fifth");
        return "On the " + dayList.get(number - 1) + " day of Christmas\n" +
                "My true love gave to me:";
    
    }
}
