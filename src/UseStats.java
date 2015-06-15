import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Stats menu
 * @author Gustavo
 */
public class UseStats {

	static int PQE,CAN,RS,FS;
	int SS;
	
	
	/**
	 * Creates stats menu and reads from textfiles
	 * @throws IOException
	 */
	public UseStats() throws IOException{
		//Read string from text
										
				FileReader file = new FileReader("src/ss.txt");
				BufferedReader r = new BufferedReader(file);				
				String ssUses = r.readLine();
				
				String ranNum = Integer.toString((Integer.parseInt(ssUses)+1));
					//Writes string to text
					BufferedWriter writer;					
					try {
						
						writer = new BufferedWriter( new FileWriter("src/ss.txt"));			
						writer.write(ranNum);						
					    writer.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				//File readers
					FileReader file2 = new FileReader("src/ss.txt");
					BufferedReader r2 = new BufferedReader(file2);				
					String ssUses2 = r2.readLine(); 
					
					FileReader file3 = new FileReader("src/rs.txt");
					BufferedReader r3 = new BufferedReader(file3);				
					String rsUses = r3.readLine(); 
					
					FileReader file4 = new FileReader("src/fs.txt");
					BufferedReader r4 = new BufferedReader(file4);				
					String fsUses = r4.readLine(); 
					
					FileReader file5 = new FileReader("src/pqe.txt");
					BufferedReader r5 = new BufferedReader(file5);				
					String pqeUses = r5.readLine();
					
					FileReader file6 = new FileReader("src/can.txt");
					BufferedReader r6 = new BufferedReader(file6);				
					String canUses = r6.readLine();
					
					
	//addSS();
	System.out.println("   Operation in the Program	   Number of Times Executed");
	System.out.println("=============================	=============================");
	System.out.println("   Process a Quadratic Equation	  		"+pqeUses);
	System.out.println("   Compute Average of Numbers	  		"+canUses);
	System.out.println("   Reverse a String	  	  		"+rsUses);
	System.out.println("   Format a String	  	  		"+fsUses);
	System.out.println("   Show Statistics	  	  		"+ssUses2);
	new MainMenu();
	}
	
	
}
