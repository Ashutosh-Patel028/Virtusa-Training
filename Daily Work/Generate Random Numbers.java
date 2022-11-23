//Java program to generate random numbers
//from 0 to given range.

import java.util.Scanner;
import java.util.Random;

class RandomNumber {
  public static void main(String[] args) {
    int maxRange;

    Scanner SC = new Scanner(System.in);
    //instance of Random class
    Random rand = new Random();

    System.out.print("Enter maximum range: ");
    maxRange = SC.nextInt();

    //generate 10 random numbers from 0 to maxRange
    for (int loop = 1; loop <= 10; loop++) {
      System.out.println(rand.nextInt(maxRange));
    }
  }
}
