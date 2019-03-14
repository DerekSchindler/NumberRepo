import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[]args){

        int number = (int)(Math.random()*100);
        Scanner anthem;
        anthem = new Scanner(System.in);
        int guess;

        System.out.println("Guess a number between 1-100");
        guess = anthem.nextInt();

        while(guess!=number){
            if(guess>number){
                System.out.println("Your guess is too high. Please ty again.");
                guess = anthem.nextInt();
            }
           else if(guess<number){
                System.out.println("Your guess is too low. Please try again.");
                guess = anthem.nextInt();
            }
            }


        if(guess==number){
            System.out.println("You guessed the right number.");
        }







    }
}
