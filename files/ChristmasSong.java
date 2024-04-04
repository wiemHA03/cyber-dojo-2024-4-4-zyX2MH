
public class ChristmasSong {

    public static String createVerseHeader(int number) {
        String dayNumber;
        if (number ==1)
            dayNumber= "first";
        else dayNumber = "second";
        return "On the "+ dayNumber +" day of Christmas\n" +
                "My true love gave to me:";
    
    }
}
