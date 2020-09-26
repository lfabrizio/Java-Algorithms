package com.fabrizio.Yahtzee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Console {

    static Scanner in = new Scanner(System.in);

    static public void welcome(){
        System.out.println("welcome to Yahtzee!");
    }

    static public void log(String output){
        System.out.println(output);
    }

    static public void log(int output){
        System.out.println(output);
    }

    public void play() {
        System.out.println("Player 1, would you like to roll?"); //ask
        String user = in.nextLine(); // response
        if(user.matches("no") || user.matches("n")){
            break;
        } else {
    System.out.println("Which die would you like to re-roll? ");

        }
    }
}
