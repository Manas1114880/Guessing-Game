
import java.util.*;

public class guessingGame {

  public static void main(String[] args) {

    Random randNum = new Random();
    int randomNumber = randNum.nextInt(100) + 1;
    System.out.print(randomNumber);

    Scanner num = new Scanner(System.in);
    System.out.print("Pick a number between 1 and 100 ");
    int nummy = num.nextInt();

    while (randomNumber != nummy){
      System.out.print("Pick a number between 1 and 100 ");
    }


  }
}

