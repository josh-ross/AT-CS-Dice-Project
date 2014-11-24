/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
  public void playGame()
  {
      Game player1 = new Game();
      Game player2 = new Game();
      int result1 = player1.rollTwoDice();
      int result2 = player2.rollTwoDice();
      System.out.println("Player 1 rolled a " + result1);
      System.out.println("Player 2 rolled a " + result2);
      if (result1 > result2)
      {
          System.out.println("Player 1 wins!");
      }
      else if (result1 == result2)
      {
          System.out.println("It's a tie!");
      }
      else
      {
          System.out.println("Player 2 wins!");
      }
  }
  
  private int rollTwoDice()
  {
      Die game1 = new Die();
      Die game2 = new Die();
      game1.roll();
      game2.roll();
      int sum = (game1.getValue()) + (game2.getValue());
      return sum;
  } 
  
  /**
   * Returns the number of times the die had to be rolled until the desired number came up
   * @param n must be an integer between 1 and 6
   * @return time is the number of rolls it takes to obtained the desired number
   */
  public int counter(int n)
  {
      Die die_rolled = new Die();
      int i = 1;
      while(die_rolled.getValue() != n)
      {
          die_rolled.roll();
          i++;
      }
      return i;
  }   
}

