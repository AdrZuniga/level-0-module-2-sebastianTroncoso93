//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		int randomNumber = ran.nextInt(4);
		
		System.out.println(randomNumber);
			
		String input = JOptionPane.showInputDialog("What is your question. (yes and no questions only)");
		
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Yes");
		}
		
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		
		if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
		}
		
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "Better save it to someone");
		}
		
		
		
		
		
	}
	
	
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
