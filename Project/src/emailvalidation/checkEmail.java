package emailvalidation;
import java.util.*;

public class checkEmail {
  
	   public static void main(String[] args) {
			
			boolean b=false;
			String[] Email={"shanker@gmail.com","elango23@yahoo.com","mouli.stark@hotmail.com","vijay67jai@gmail.com","mani3453@hotmail.com","charan02@protonmail.com"};
	        System.out.println("Enter your Email ID");
	        Scanner sc=new Scanner(System.in);
	        String Mail=sc.nextLine();
	        for(int i=0;i<Email.length;i++)
	        {
	        	if(Mail.equalsIgnoreCase(Email[i]))
	        	{
	        		b=true;
	        	}
	        }
	        if(b==true)
	        {
	        	System.out.println("Employee Email-ID entered is present");
	        }
	        else
	        {
	        	System.out.println("Employee Email-ID entered is not present");
	        }
	        sc.close();
		}

	}
