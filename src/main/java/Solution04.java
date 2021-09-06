import java.util.Scanner;

public class Solution04 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 04 Solution
     *  Copyright 2021 Reynaldo Martinez
     */
    /*
     * Write Application
     * Prompt user for noun ver adjective adverb
     * Store each input as 'userNoun' 'userVerb' 'userAdjective' 'userAdverb'
     * Create a dope story
     * Use printf for string substitution for output
     */
    public static void main(String[] args){
        Scanner madLibScan = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String userNoun = madLibScan.nextLine();
        System.out.print("Enter a verb: ");
        String userVerb = madLibScan.nextLine();
        System.out.print("Enter an adjective: ");
        String userAdjective = madLibScan.nextLine();
        System.out.print("Enter an adverb: ");
        String userAdverb = madLibScan.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's comical!", userVerb, userAdjective, userNoun, userAdverb);
    }
}
