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
    System.out.println("Here's how to play. I am going to think of random number\n between 1 and 100.");
    System.out.println("It is your job, to try to guess that number.\nAre you ready?");
    System.out.println();
    System.out.println("What number am I thinking of?");
    System.out.println();

    userNumber = keyboard.nextInt();

    if (userNumber > pickedNumber){
        System.out.println("That was too high.");
    }
    else System.out.println("Nope. Guess again.");
    if (userNumber < pickedNumber) {
        System.out.println("That was too low.");
    }
    else System.out.println("Nope. Guess again.");
    if (userNumber == pickedNumber) {
        System.out.println("Wow! You got it on your first try. Good Job!");
    }

    }
}
