import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Check whether there is a word 'cat' in the string");
        String expressions1 = "\\b(\\w*cat\\w*)\\b";
        System.out.println(Pattern.matches(expressions1, "ilikecat"));
        System.out.println(Pattern.matches(expressions1, "cayyyta"));

        System.out.println("Check if a string only contains numbers");
        String expressions2 = "^[0-9]*$";
        System.out.println(Pattern.matches(expressions2, "1357924690"));
        System.out.println(Pattern.matches(expressions2, "135test246"));

        System.out.println("Matches a string if it is a valid gmail address");
        String expressions3 = "(\\W|^)[\\w.\\-]{0,25}@gmail\\.com(\\W|$)";
        System.out.println(Pattern.matches( expressions3, "becky@gmail.com"));
        System.out.println(Pattern.matches( expressions3, "becky@yahoo.com"));

        System.out.println("Matches a string if it is a valid date format (yyyy-mm-dd)");
        String expressions4 = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
        System.out.println(Pattern.matches(expressions4,"1990-05-30"));
        System.out.println(Pattern.matches(expressions4, "3600-35-22"));

        System.out.println("Matches a string if it is a ten digits phone number");
        String expressions5 = "^(\\+\\d{1,3}\\s)?(?:\\(\\d{3}\\)|\\d{3})[\\s.-]\\d{3}[\\s.-]\\d{4}$";
        System.out.println(Pattern.matches(expressions5, "123-456-7890"));
        System.out.println(Pattern.matches(expressions5, "13-test-79"));
    }
}
