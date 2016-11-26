import java.util.Scanner; 
public class HauntedCastle {

	public static void main(String[] args) {
		
		// verify eclipse
		System.out.println("Welcome to the Haunted Castle");
		// create a scanner object
		 Scanner input = new Scanner(System.in); 
		// Start the project
		System.out.println("Tai, Mai, and Sey are in a haunted castle. ");
		System.out.println("The group is in the castle because of their curiosity \n, and they also always want to be in a haunted place. \nHowever, they are lost. ");
		System.out.println("They must decide what to do next.");
		
		//Give print statement to ask what they are going to do
		System.out.println("Do you want to split up or stay together \nas a group to continue the adventure?");
		System.out.println("1 = stay together, 2 = split up");
		int Decision = input.nextInt();
		
		// Ask the group to choose the door
		if (Decision == 1) { //boolean
			System.out.println("The group decided to stay together. \nThey proceed to walk toward a dark hallway.");
			System.out.println("They see 3 doors, red (1), yellow(2), and blue(3). \nThey must choose which door to open");
			int door = input.nextInt();
			// The item that is inside each door
			switch (door % 4) { //switch statement 
			case 1: System.out.println("They choose the red door. \nThey would find a torch."); break;
			case 2: System.out.println("They choose the yellow door and find a flashlight."); break;
			case 3: System.out.println("Blue door is choosen. Nothing is in there."); break;
			
			}
			if (door <= 2 ){ //with the flashlight/torch, they all survive.
			System.out.println("A dark figure suddenly appears in front of them. \nThey use the torch/flashlight and point it against the dark figure. \nThe figure runs away.");	
			
			// Insert a built in math function
						System.out.println("Sey sees a weird circular object on the wall, \nshe guesses its angle is about 30 degrees. \nSey then turns around and asks Tai to convert it to radians");
						double answer = Math.toRadians(30); // Degree to Radian
						// Print the answer
						System.out.println("Tai says: Easy, the answer is: " + answer);
						System.out.println("The group all smile happily and continue to proceed.");
						// Encounter the door password
						System.out.println("They encounter a big door. Woohoo! It seems like it's the way out. \nHowever, they notice a letter pad on the door. \nIt asks for a password using the alphabet.");
						// Guessing the password
						String[] words = { "password" };
				
						int numberOfMisses = 0 ;
						do {
						   int i = intRandom(0, words.length - 1);
						   char[] word = words[i].toCharArray();
						   boolean[] mask = new boolean[word.length];
						   int numberOfCorrectGuess = 0;
						   
						   while (numberOfCorrectGuess != word.length) {
						    System.out.print("(Guess) Enter a letter in word ");
						 
						    // Print out result
						    for (int j = 0; j < word.length; j++) {
						 
						     if (mask[j])
						      System.out.print(word[j]);
						     else
						      System.out.print("*");
						 
						    }
						 
						    System.out.print(">");
						    char guess = input.next().charAt(0);
						 
						    // Checking
						    boolean miss = true;
						    boolean repeat = false;
						 
						    for (int j = 0; j < word.length; j++) {
						     if (word[j] == guess) {
						      if (mask[j] != true) {
						       mask[j] = true;
						       numberOfCorrectGuess++;
						      } else {
						       repeat = true;
						       break;
						      }
						      miss = false;
						     }
						    }
						 
						    if (miss)
						     numberOfMisses++;
						    if (repeat)
						     System.out.println(guess + " is already in the word");
						 
						   }
						 
						   System.out.println("The password is " + String.valueOf(word) +"\nYou did great! The door is unlocked. The group gets out of the haunted castle. \nThey can't wait to tell their classmates about the amazing experience inside the castle. \nTHE END");
						  } while (numberOfMisses  < 0);
							  		
						 }
			else
				if (door == 3 ){// They dont have anything to stand against the figure, ended up dying.
					System.out.println("They don't have anything to fight against the dark figure. \nTai, Mai, and Sey are too afraid that they all pass out. \nGame ends here.");
				}
			
			 
		 else if (Decision == 2) {
			customPrintOutStatement();
			
		 }
		}
		//A multidimensional array that holds the three hostages as a team
		//declares the array of players
		int [] [] players = new int [1] [3];
		//Assign a for loop
		for(int i = 0; i < players.length; i++){
			for(int j = 0; j < players[i].length; j++){
		}
		}
	}


	private static void customPrintOutStatement() {
		System.out.print("The group decides split up. \nThey start to walk on their own direction. \nThey would all get lost and die in the castle alone. \nTHE END");
	}


	public static int intRandom(int lowerBound, int upperBound) {
	  return (int) (lowerBound + Math.random()
	    * (upperBound - lowerBound + 1));
	}
	}
	






