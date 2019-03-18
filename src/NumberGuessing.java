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
                System.out.println("Your guess is too high.");

            }
           else if(guess<number){
                System.out.println("Your guess is too low.");

            }
            attempt=attempt-1;
            System.out.println("You have "+attempt+" attempts left");
            if(attempt!=0){
                guess = anthem.nextInt();
            }
            }


        if(guess==number){
            System.out.println("You guessed the right number.");
        }
        else{
            System.out.println("You ran out of attempts.");
        }







    }
}
