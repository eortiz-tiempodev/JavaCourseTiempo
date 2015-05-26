package com.tiempo.activities.activity2;

import java.util.Scanner;

/*************************************************************************
 *  Compilation:  javac Deal.java
 *  Execution:    java Deal PLAYERS
 *
 *  Deal 5-card hands at random to the given number of players.
 *
 *  % java Deal 3
 *  4 of Spades
 *  9 of Spades
 *  Ace of Hearts
 *  9 of Clubs
 *  9 of Diamonds
 *
 *  6 of Spades
 *  10 of Hearts
 *  Queen of Hearts
 *  8 of Hearts
 *  King of Spades
 *
 *  7 of Hearts
 *  8 of Diamonds
 *  Queen of Spades
 *  3 of Spades
 *  4 of Diamonds
 *
 *************************************************************************/

public class Deal {
    public static void main(String[] args) {
  	   Scanner in = new Scanner(System.in);
  	   System.out.print("Number of Players : ");

  	   String players = in.next();
       int PLAYERS  = Integer.parseInt(players);
    
       int CARDS_PER_PLAYER = 5;

        String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // avoid hardwired constants
        int SUITS = suit.length;
        int RANKS = rank.length;
        int CARDS = SUITS * RANKS;

        if (CARDS_PER_PLAYER * PLAYERS > CARDS) throw new RuntimeException("Too many players");

        // initialize deck
        String[] deck = new String[CARDS];
        for (int i = 0; i < RANKS; i++) {
            for (int j = 0; j < SUITS; j++) {
                deck[SUITS*i + j] = rank[i] + " of " + suit[j];
            }
        }

        // shuffle
        for (int i = 0; i < CARDS; i++) {
            int r = i + (int) (Math.random() * (CARDS-i));
            String t = deck[r];
            deck[r] = deck[i];
            deck[i] = t;
        }

        String [] player = new String[5];
        int index = 0;

        // print shuffled deck
        for (int i = 0; i < PLAYERS * CARDS_PER_PLAYER; i++) {
            System.out.println(deck[i]);
            player[index++] = deck[i];
            if (i % CARDS_PER_PLAYER == CARDS_PER_PLAYER - 1){

            	System.out.println("\nTHIS IS YOUR PREVIOUS DECK, Do you want to change a card (1=YES 0=NO) :  ");
            	String extra = in.next();
            	int EXTRACARD  = Integer.parseInt(extra);
            	
            	if(EXTRACARD == 1){
            		int randomCard = (int)(Math.random()*5 + 1);
            		player[randomCard] = deck[deck.length - i];
            		System.out.println("YOUR NEW DECK:  ");
                } else if (EXTRACARD == 0){
             	   System.out.print("ACCEPT YOUR ORIGINAL DECK:  ");
                } else {
             	   System.out.print("NOT VALID OPTION; ACCEPT YOUR ORIGINAL DECK:  ");
                }
            	
        		for(int l=0; l<player.length; l++){
        			System.out.println(player[l]);
        		}
            	System.out.println();
            	System.out.println("---------------------------");
            	player = new String[5];
            	index = 0;
            	
            }
        }
        
    	in.close();
    }

}
