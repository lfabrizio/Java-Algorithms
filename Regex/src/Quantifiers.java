import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        // Regex Quantifiers
        System.out.println("?quantifier....");
        System.out.println(Pattern.matches("[ayz]?", "a"));//true
        System.out.println(Pattern.matches("[ayz]?", "aaa"));//false a more than one time
        System.out.println(Pattern.matches("[ayz]?", "ayyyzz"));//false ayz more than one time
        System.out.println("+quantifier....");
        System.out.println(Pattern.matches("[ayz]+", "a"));//true a shows one or more time
        System.out.println(Pattern.matches("[ayz]+", "aaa"));//true a or y or z comes more than once
        System.out.println(Pattern.matches("[ayz]+", "aammta"));//false m and t are not matching pattern
        System.out.println("*quantifier....");
        System.out.println(Pattern.matches("[ayz]*", "ayyyza"));//true a or y or z zero or more times
    }
}
