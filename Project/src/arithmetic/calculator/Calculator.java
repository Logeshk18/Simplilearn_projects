package arithmetic.calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	    double x,y;
	    int i,s=1;
	    Scanner sc=new Scanner(System.in);
	    while(s==1)
	    {
	    	System.out.println(" choose the type of operation \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division ");
	        i=sc.nextInt();
	        while(i<1 || i>4)
	        {
	        	System.out.println("Please enter 1 (or) 2 (or) 3 (or) 4");
	        	i=sc.nextInt();
	        }
	        switch(i)
	        {
	        case 1:
	        
	        	System.out.println(" Enter two numbers for Addition operation ");
	        	x=sc.nextDouble();
	        	y=sc.nextDouble();
	        	System.out.println("Ans = " + (x+y));
	        	break;
	        
	        case 2:
	        
	        	System.out.println(" Enter two numbers for Subtraction operation ");
	        	x=sc.nextDouble();
	        	y=sc.nextDouble();
	        	System.out.println("Ans = " + (x-y));
	        	break;
	        
	        case 3:
	        
	        	System.out.println(" Enter two numbers for Multiplication operation ");
	        	x=sc.nextDouble();
	        	y=sc.nextDouble();
	        	System.out.println("Ans = " + (x*y));
	        	break;
	        
	        case 4:
	        
	        	System.out.println("Enter two numbers for Division operation");
	        	x=sc.nextDouble();
	        	y=sc.nextDouble();
	        	System.out.println("Ans = " + (x/y));
	        	break;
	        
	        }
	        System.out.println("Confirm 1 to continue (or) Press 0 to exit operation");
	        s=sc.nextInt();
	    }
	    sc.close();
	    if(s==0)
	    {
	    	System.out.println("Calculator closed");
	    }

	}

}