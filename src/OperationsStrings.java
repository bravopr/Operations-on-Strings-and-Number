import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Performs operations on Strings
 * @author Gustavo
 *
 */

public class OperationsStrings {

	public OperationsStrings() throws IOException 
	{
		int ErrorCount=0;
		
		Scanner in = new Scanner(System.in);
		
		while(ErrorCount <=3)
		{
			if(ErrorCount == 3)
			{
				System.out.println("You have reached the maximum number of tries."+"\nInput Error Count: "+ErrorCount);
				System.exit(0);
			}
		System.out.println("\nOperations on Strings Menu: (Choose an option and press enter)");
		System.out.println(" This part is still under development.");
	/*	System.out.println("	1> Show Reverse of a Given String");
		System.out.println("	2> Format Strings");
		System.out.println("	3> Exit"); 
		
		int UserInput = in.nextInt();
		
		
			if (UserInput < 1 || UserInput > 4)		
			{			
			ErrorCount++;
			//System.out.println("Please input a valid option.");			
			}
						
			switch(UserInput)  
			{
			 
			case 1: UserInput = 1;
			
				//UseStats.addRS();		
				Scanner input = new Scanner(System.in);
				System.out.print("Please type the string:");
				String inputString = input.nextLine();
				System.out.print(stringReverse(inputString));				
				//input.close();
				new OperationsStrings();
								
			case 2: UserInput = 2;
				
		    	//UseStats.addFS();
				Scanner input2 = new Scanner(System.in);
						
				System.out.print("Please type the string:");
				String inputString2 = input2.nextLine();
				System.out.print("Please type the string format: (Ex:xxx-xxx-xxx)");
				String inputFormat = input2.nextLine();
				stringFormat(inputString2,inputFormat);				
				//input2.close();
				new OperationsStrings();
				
							
			case 3: UserInput = 3;
			new MainMenu();
			} */
		
		System.exit(0);
		}	
				
			
	}
	/**
	 * 	The stringReverse method reverses the string typed by the user.
	 * @param The string typed by user.
	 * @return String
	 * @throws IOException 
	 */
	
	public String stringReverse(String input) throws IOException {
		
		//Stored number of times method is used
		//Read string from text		
		FileReader file = new FileReader("src/rs.txt");
		BufferedReader r = new BufferedReader(file);				
		String ssUses = r.readLine();
		//System.out.print(ssUses);
		String ranNum = Integer.toString((Integer.parseInt(ssUses)+1));
			//Writes string to text
			BufferedWriter writer;					
			try {
				
				writer = new BufferedWriter( new FileWriter("src/rs.txt"));			
				writer.write(ranNum);						
			    writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		//Method Start
		   int length = input.length();
		    StringBuilder str = new StringBuilder(length);
		   
		    for (int i = (length - 1); i >= 0; i--){
		        str.append(input.charAt(i));
		    }
		    return str.toString();
		    
		    
	}
	
	/**
	 * 
	 * 	The strinFormat method reverses the string formated.
	 * @param The string typed by user.
	 * @return String
	 * @throws IOException 
	 */
	public void stringFormat(String input, String input2) throws IOException {
		//Stored number of times method is used
				//Read string from text		
				FileReader file = new FileReader("src/fs.txt");
				BufferedReader r = new BufferedReader(file);				
				String ssUses = r.readLine();
				//System.out.print(ssUses);
				String ranNum = Integer.toString((Integer.parseInt(ssUses)+1));
					//Writes string to text
					BufferedWriter writer;					
					try {
						
						writer = new BufferedWriter( new FileWriter("src/fs.txt"));			
						writer.write(ranNum);						
					    writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
			//Method Start HAY QUE ARREGLAR
					String name = input;
					String strX = input2;			
					String[] strXArray = strX.split("-");
					int arrayL = strXArray.length;
					
					ArrayList<Integer> Q = new ArrayList<Integer>(arrayL);		
					
					StringBuilder str = new StringBuilder(strX.length());	
					for(int i=0; i< arrayL ;i++ )
					{
					//	System.out.println(strXArray[i]);				
						int numChar = (strXArray[i].toString()).length();	   	       
						Q.add(i, numChar);
									
					}		
					//System.out.println(Q.toString());
					String out="";
					String out2="";
					for(int a =0; a < Q.size() ;a++)
					{
						
						if(a==0){
						out = name.substring(a,(int)Q.get(a));}		
						//System.out.println(out);}
						
						else{
							out2 = "-"+name.substring((int)Q.get(a-1),(int)Q.get(a-1)+(int)Q.get(a));			
							System.out.println(out+out2);}
					}				
					 //return (out+out2);

	}
	
	
	
}