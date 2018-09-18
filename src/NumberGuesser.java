import java.util.Scanner;

public class NumberGuesser {

public static void main(String [] args){

    int pickedNumber;
    int userNumber;
    Scanner keyboard;

    pickedNumber = (int) (Math.random()*100);
    keyboard = new Scanner(System.in);

    System.out.print(pickedNumber+ "\n");

    System.out.println("Welcome to the NumberGuessing Game!");
    System.out.println("Here's how to play. I am going to think of random number\nbetween 1 and 100.");
    System.out.println("It is your job, to try to guess that number.\n \nAre you ready?");
    System.out.print("What number am I thinking of?");
    System.out.println();

    userNumber = keyboard.nextInt();

    if (userNumber == pickedNumber){
        System.out.println("Wow! You got it on your first try.");
    }
    if (userNumber > pickedNumber){
        System.out.println("Nope. Guess again.\nThat was too high.");
        userNumber = keyboard.nextInt();
    }
    if (userNumber < pickedNumber){
        System.out.println("Nope. Guess again.\nThat was too low.");
        userNumber = keyboard.nextInt();
    }
    ////
    if (userNumber > pickedNumber){
        System.out.println("Try again.\nThat is still too high.");
        userNumber = keyboard.nextInt();
    }
    else if (userNumber < pickedNumber){
        System.out.println("Try again.\nThat is still too low.");
        userNumber = keyboard.nextInt();
    }
    ////
    if (userNumber > pickedNumber){
        System.out.println("Keep trying.\nThe number you are guessing is too high.");
        userNumber = keyboard.nextInt();
    }
    else if (userNumber < pickedNumber){
        System.out.println("Keep trying.\nThe number you are guessing is too high.");
        userNumber = keyboard.nextInt();
    }
    ////
    if (userNumber > pickedNumber){
        System.out.println("Nope. Guess again.\nYou are still too high.");
        System.out.println("\\\\\\\\\\ Warning! This is your last chance! \\\\\\\\\\");
        userNumber = keyboard.nextInt();
    }
    else if (userNumber < pickedNumber){
        System.out.println("Nope. Guess again.\nYou are still too low.");
        System.out.println("\\\\\\\\\\ Warning! This is your last chance! \\\\\\\\\\");
        userNumber = keyboard.nextInt();
    }

    else if (userNumber == pickedNumber){
        System.out.println("Congratulations! You guessed it!The number I was thinking of was " + pickedNumber + ".");
    }
    else System.out.println("Aww. You are still wrong. My number was" + pickedNumber + ".");
    }

        }

