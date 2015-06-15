import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * MainMenu has the main menu blueprints.
 * @author Gustavo Bravo
 *
 */
public class MainMenu {
	
	
	//public static void main(String[] args) {
	
	//	new MainMenu();
		
//	}
	/**
	 * Main Menu Constructor, builds the main menu.
	 * @throws IOException 
	 */
	public MainMenu() throws IOException{
		int ErrorCount=0;
		
		System.out.println("\nGustavo Bravo's Strings and Numbers Operations Project");
		Scanner in = new Scanner(System.in);
		
		while(ErrorCount <=3)
		{
			if(ErrorCount == 3)
			{
				System.out.println("You have reached the maximum number of tries."+"\nInput Error Count: "+ErrorCount);
				System.exit(0);
			}
		System.out.println("\nMain Menu: (Choose an option and press enter)");
		System.out.println("	1> Perform Operations on Numbers");
		System.out.println("	2> Perform Operations on Strings");
		System.out.println("	3> Show Use Statistics"); 
		System.out.println("	4> Exit Program");
		int UserInput = in.nextInt();
		
		
			if (UserInput < 1 || UserInput > 5)		 
			{			
			ErrorCount++;
			//System.out.println("Please input a valid option.");			
			}
			
			switch(UserInput)  
			{
			 
			case 1: UserInput = 1;
				new OperationsNumbers();		
			case 2: UserInput = 2;
				new OperationsStrings();
			case 3: UserInput = 3;
				try {
					new UseStats();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			//Clear All Statistics	and Exit Program
			case 4: UserInput = 4;
			String[] arrayFileNames = {"src/ss.txt","src/can.txt","src/fs.txt","src/pqe.txt","src/rs.txt"};					
			
			for( int i =0; i < arrayFileNames.length ; i++ )
			{
			FileReader file = new FileReader(arrayFileNames[i]);
			BufferedReader r = new BufferedReader(file);				
			String ssUses = r.readLine();
			String ranNum = Integer.toString(0);
				//Writes string to text
				BufferedWriter writer;					
				try {
					
					writer = new BufferedWriter( new FileWriter(arrayFileNames[i]));			
					writer.write(ranNum);						
				    writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
				
				System.exit(0);	
			
				
			
			}		
		}
		in.close();
		
	}
	

}
