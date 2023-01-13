import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        int secretNum = rand.nextInt(100);
        Scanner myObj = new Scanner(System.in);
        int guess = -secretNum;
        String tempGuess;
        while (guess != secretNum) {
            tempGuess = myObj.nextLine();
            guess = Integer.parseInt(tempGuess);
            if (guess > secretNum)
                System.out.println("Lower");
            else if (guess < secretNum)
                System.out.println("Higher");
            else
                System.out.println("YOU WINNNN");
        }
    }


}

