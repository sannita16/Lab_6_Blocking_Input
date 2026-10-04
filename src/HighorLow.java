import java.util.Random;
import java.util.Scanner;

public class HighorLow
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        boolean done = false;
        int rndVal = gen.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";

        do {
            IO.print("Enter your guess [1 - 10]: ");

            if(in.hasNextInt())
            {
                userGuess = in.nextInt();

                if(userGuess >= 1 && userGuess <= 10)
                {
                    done = true;
                }
                else
                {
                    IO.println("Your guess must be between 1 and 10.");
                    IO.println("Try again!");
                }
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid value not: " + trash);
                IO.println("Try again!");
            }

        }while(!done);

        IO.println("You said your guess is " + userGuess);
        IO.println("The random number was " + rndVal);

        if(userGuess > rndVal)
        {
            IO.println("Your guess was too high!");
        }
        else if(userGuess < rndVal)
        {
            IO.println("Your guess was too low!");
        }
        else
        {
            IO.println("On the money!");
        }

    }

}

