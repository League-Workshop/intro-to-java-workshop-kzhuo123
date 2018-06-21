package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		int playerHealth=100;
		int dragonHealth=100;
		int playerDamage=0;
		int dragonDamage=0;
		while(playerHealth>0 && dragonHealth>0) { 
			for(int i=0;i<75;i++) {
		String ans=JOptionPane.showInputDialog("Do you want to kick or yell?");
		if (ans.equals("yell")) {
			int yell=new Random().nextInt(6)+10;
			dragonDamage=dragonDamage+ yell ;
			dragonHealth=dragonHealth- yell;
			}
		if (ans.equals("kick")) {
			int kick=new Random().nextInt(35);
			dragonDamage=dragonDamage+ kick;
			dragonHealth=dragonHealth- kick;
			}
		int fire= new Random().nextInt(1)+13;
		playerDamage=playerDamage+ fire;
		playerHealth=playerHealth- fire;
		
		JOptionPane.showMessageDialog(null, "Dragon Health=" + dragonHealth +
				 "Your Health=" + playerHealth
				);
	
		if (playerHealth<0) {
			JOptionPane.showMessageDialog(null, "YOU LOSE");
			System.exit(0);
		} 
		if (dragonHealth<0) {
			JOptionPane.showMessageDialog(null, "YOU WIN");
			System.exit(0);
			
		}
		}
	// 1. Create a main method and put all of the code below inside of it

	

		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		
		// 4. Create a variable to hold the damage the player's attack does each round
		
		// 5. Create a variable to hold the damage the dragon's attack does each round
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		  //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		
		// 9. If they typed in "yell":
		
			//-- Find a random number between 10 and 15 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 35 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
}


