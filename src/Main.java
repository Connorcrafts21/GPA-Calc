// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//import java.util.Random
import java.util.Scanner;

public class Main {
    public static final String RESET = "\u001B[0m"; //reset color
    public static final String BLACKT = "\u001B[30m"; //colors
    public static final String BLACKB = "\u001B[40m";
    public static final String REDT = "\u001B[31m";
    public static final String REDB = "\u001B[41m";
    public static final String GREENT = "\u001B[32m";
    public static final String GREENB = "\u001B[42m";
    public static final String YELLOWT = "\u001B[33m";
    public static final String YELLOWB = "\u001B[43m";
    public static final String BLUET = "\u001B[34m";
    public static final String BLUEB = "\u001B[44m";
    public static final String CYANT = "\u001B[36m";
    public static final String CYANB = "\u001B[46m";

    public static void main(String[] args) {
    Scanner sysin = new Scanner(System.in); //Creates Scanner as "sysin"
    double average, total, science, meth, engrish, history; //Adds all Vars as Doubles

    System.out.println(GREENB + BLACKT + "Enter Science grade" + RESET);
    science = sysin.nextDouble(); //takes in number

    System.out.println(REDB + BLACKT + "Enter Meth grade" + RESET);
    meth = sysin.nextDouble();

    System.out.println(BLUEB + BLACKT + "Enter Engrish grade" + RESET);
    engrish = sysin.nextDouble();

    System.out.println(YELLOWB + BLACKT + "Enter History grade" + RESET);
    history = sysin.nextDouble();

    total = engrish + meth + science + history;
    average = total / 4;

    if (total > 400 ){
        System.out.println("Your total is invalid, please make sure you typed the right grades");}
    else {
        System.out.println(CYANT + "The total of your grades is " + RESET + BLUET + BLACKB + +total + RESET);
        System.out.println(CYANT + "Your Unweighted GPA is " + RESET + BLUET + BLACKB + average + RESET);

        if (average < 65) {
            System.out.println(REDT + "Your Weighted GPA is " + RESET + BLACKT + REDB + "0.1" + RESET + REDT + ", Wow you are stupid" + RESET);} else {
            System.out.println(CYANT + "Your Weighted GPA is unable to be printed as Connor is lazy and doesn't want to write 200 lines of code for a simple calculator" + RESET);}
        }
    }
}