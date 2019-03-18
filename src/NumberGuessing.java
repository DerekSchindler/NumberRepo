import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[]args){

        int number = (int)(Math.random()*100);
        Scanner anthem;
        anthem = new Scanner(System.in);
        int guess;
        int attempt = 10;

        System.out.println("Guess a number between 1-100");
        guess = anthem.nextInt();

        while(guess!=number&&attempt!=0){
            if(guess>number){
                System.out.println("Your guess is too high. Please ty again.");

            }
           else if(guess<number){
                System.out.println("Your guess is too low. Please try again.");

            }
            System.out.println("You have "+attempt+" attempt left");
            guess = anthem.nextInt();
            attempt=attempt-1;
            }


        if(guess==number){
            System.out.println("You guessed the right number.");
        }
        else{
            System.out.println("You ran out of attempts.");
        }







    }
}
