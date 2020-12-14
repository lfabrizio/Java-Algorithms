package com.fabrizio;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
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



        System.out.println("metacharacters d....");//d for digit
        System.out.println(Pattern.matches("d", "abc"));//false non-digit
        System.out.println(Pattern.matches("d", "1"));//true digit that comes once
        System.out.println(Pattern.matches("d", "4443"));//false digit but comes more than once

        System.out.println("metacharacters D....");//D means non digit
        System.out.println(Pattern.matches("D", "abc"));//false non-digit but comes more than once
        System.out.println(Pattern.matches("D", "1"));//false digit
        System.out.println(Pattern.matches("D", "4443"));//false digit
        System.out.println(Pattern.matches("D", "m"));//tru non digit


        System.out.println("metacharacters D with quantifier");
        System.out.println(Pattern.matches("D*", "abc"));//true non digit and comes 0 or more
    }
}
