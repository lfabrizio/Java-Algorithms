package com.fabrizio.Yahtzee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Console {
    //user prompts
    Scanner in = new Scanner(System.in);



    public void play() {
        System.out.println("Player 1, would you like to roll?"); //ask
        String user = in.nextLine(); // response
        if(user == "No" || user == "N"){
            break;
        } else {
    System.out.println("Which die would you like to re-roll? ");

        }
    }
}
