package com.fabrizio;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here




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
