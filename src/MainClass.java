import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args)

	{
		
		Scanner myKeyboard = new Scanner(System.in);
		String doAgain;
		int gameCount = 0;
		Random myRNG = new Random();
		int myChoice;
//		int winGame = 0;
		int size = 10;
		int i = 0;
		int [] winGame  = new int [size];
//		float evenCount = 0;
		int [] evenCount  = new int [size];
//		float oddCount = 0;
		int [] oddCount  = new int [size];
//		float winPercent;
		int [] winPercent  = new int [size];
//		float evenPercent;
//		int [] oddPercent  = new int [size];
//		float oddPercent;
		int [] cpuArray = new int [size];

		do {

			myChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess the number (1-10)."));
			int cpuChoice = myRNG.GetaNumber_between_1_and_10();
			
			cpuArray[i] = cpuChoice;
			
			
			while (myChoice < 1 || myChoice > 10)
			{
				if(myChoice < 1 )
				{
					JOptionPane.showMessageDialog(null, "Too low.\nNumbers below 1 are not valid.\nEnter a higher number.");
				}
				else if (myChoice > 10)
				{
					JOptionPane.showMessageDialog(null, "Too high. Numbers above 10 are not valid. Enter a lower number.");
				}
				myChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess the number (1-10)."));
			}
			if (myChoice == cpuChoice) 
			{
				
				JOptionPane.showMessageDialog(null, "You've guessed it!");
				if (myChoice % 2 == 0)
				{
					evenCount[i] = myChoice;
					
				}
				else if (myChoice % 2 != 0)
				{
					oddCount[i] = myChoice;										
				}
				winGame[i] = 1;
				
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Sorry, the number was " + cpuChoice + ".");
				if (myChoice % 2 == 0)
				{
					evenCount[i] = myChoice;
				}
				else if (myChoice % 2 != 0)
				{
					oddCount[i] = myChoice;						
				}
				winGame[i] = 0;
			}
			/*doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();
			while(!(doAgain.matches("[YN]+"))) 
			{				
				JOptionPane.showMessageDialog(null, "Error: Invalid choice.");
				doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();

			}
			*/
			i++;
			gameCount++;
		} while (gameCount < 10);

		//evenPercent = (evenCount / gameCount) * 100;
		//oddPercent = (oddCount / gameCount) * 100;
		//winPercent = (winGame / gameCount) * 100;

		//JOptionPane.showMessageDialog(null, "Here are your stats: \n" + "Number of games played: " + gameCount + "\n" + 
		//		"Percent of games won: " + winPercent + "%\n" + "Percent of even guesses by you: " + evenPercent + "%\n" + "Percent of odd numbers the dice landed on: "
		//		+ oddPercent + "%");
		
		for (int a=0; a <evenCount.length; a++)
		{
			System.out.println("Even Guesses: " + evenCount[a]);
		}
		for (int b=0; b < oddCount.length; b++)
		{
			System.out.println("Odd Guesses " + b + ": " + oddCount[b]);
		}
		for (int c=0; c < winGame.length; c++)
		{
			System.out.println("Win Loss: " + winGame[c]);
		}
		for (int d=0; d < cpuArray.length; d++)
		{
			System.out.println("Computer Numbers: " + cpuArray[d]);
		}
		JOptionPane.showMessageDialog(null,"GoodBye!");
	}
}