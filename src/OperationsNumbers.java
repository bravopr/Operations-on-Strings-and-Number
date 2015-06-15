import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Performs Operations on Numbers
 * @author Gustavo Bravo
 *
 */

public class OperationsNumbers {
	

	double root1, root2;
	
	/**
	 * Builds Operation Numbers Menu
	 * @throws IOException
	 */
	public OperationsNumbers() throws IOException 
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
		System.out.println("\nOperations on Numbers Menu: (Choose an option and press enter)");
		System.out.println("	1> Process Quadratic Equation");
		System.out.println("	2> Compute Average of List of Numbers");
		System.out.println("	3> Exit"); 
		
		int UserInput = in.nextInt();
		
		
			if (UserInput < 1 || UserInput > 4)		
			{			
			ErrorCount++;
			//System.out.println("Please input a valid option.");			
			}
						
			switch(UserInput)  
			{
			 //First Option
			case 1: UserInput = 1;
			
		//	UseStats.addPQE();
			int a,b,c;
			Scanner input = new Scanner(System.in);	
			System.out.println("Input the terms of the quadratic formula:");
			System.out.println("Input first term:"); 
			a = input.nextInt();
			System.out.println("Input second term:");
			b = input.nextInt();
			System.out.println("Input third term:");
			c = input.nextInt();
			quadEq(a,b,c);
			
			int r1 = (int) root1;
			int r2 = (int) root2;
			
			if((r1&r2)!=0){
			System.out.println("The results are: ("+ getRoot1()+", "+getRoot2()+")" );}
			else{System.out.println("The are no real solutions.");}
			//input.close();
			new OperationsNumbers();
			
			//Second Option
			case 2: UserInput = 2;
			
		//	UseStats.addCAN();
			System.out.println("To compute average of a list of positive numbers, input the number and press enter,");
			System.out.println("when you finish with all the numbers type '-1' and press enter:");
			Scanner input2 = new Scanner(System.in);	
			ArrayList<Double> dList = new ArrayList<Double>();
			
			double num;
			do
		    {				
			num = input2.nextDouble();	//Input values to Arraylist			
		       if( num < 0){break;}  //If value is negative break loop
		       else{
		       dList.add(num);}		//Else added to the ArrayList		       
		    }
		    while( num > 0);   		    	       
		   // input2.close();			
			System.out.println("The average of the list of numbers is: "+ compAVG(dList));
			new OperationsNumbers(); //Start Again
			
			//Third Option
			case 3: UserInput = 3;
				new MainMenu();
			}

		}
	}
	
	/**
	 * Computes the average of numbers
	 * @param double
	 * @return Average of a list of numbers.
	 * @throws IOException 
	 */
	public double compAVG(ArrayList<Double> a) throws IOException{
		//Stored number of times method is used
				//Read string from text		
				FileReader file = new FileReader("src/can.txt");
				BufferedReader r = new BufferedReader(file);				
				String ssUses = r.readLine();
				//System.out.print(ssUses);
				String ranNum = Integer.toString((Integer.parseInt(ssUses)+1));
					//Writes string to text
					BufferedWriter writer;					
					try {
						
						writer = new BufferedWriter( new FileWriter("src/can.txt"));			
						writer.write(ranNum);						
					    writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
		//compAVG Method Start		
		
		double avg;
		double sum=0;
				
		//Sums all the elements and counts them
	    for(int i = 0; i < a.size(); i++)
	    {	    	
	        sum = sum + a.get(i);
	    }
	    
	    avg = sum/(a.size());		
		return avg;
	}
	
	
	
	/**
	 * Receives 3 coefficients and solves the quadratic equation.
	 * @param a int
	 * @param b int
	 * @param c int
	 * @throws IOException 
	 */
	public void quadEq(int a, int b, int c) throws IOException
	{	
		//Stored number of times method is used
				//Read string from text		
				FileReader file = new FileReader("src/pqe.txt");
				BufferedReader r = new BufferedReader(file);				
				String ssUses = r.readLine();
				//System.out.print(ssUses);
				String ranNum = Integer.toString((Integer.parseInt(ssUses)+1));
					//Writes string to text
					BufferedWriter writer;					
					try {
						
						writer = new BufferedWriter( new FileWriter("src/pqe.txt"));			
						writer.write(ranNum);						
					    writer.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
		//Method Start		
		if((Math.pow(b, 2) - 4*a*c) >0){
	    root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
	    root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a); }
		else{
			root1= 0;
			root2= 0;
		}
	    
	}
	/**
	 * Returns value of first root
	 * @return int
	 */
	 public double getRoot1() {
			return root1;
		}
	 /**
	  * Second value of first root
	  * @return
	  */
		public double getRoot2() {
			return root2;
		}	
	}	
	

	
//}