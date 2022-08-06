package Movie_ticket_booking;

import java.util.*;

class Theatre {
	
	int i;
	Scanner sc=new Scanner(System.in);
	LinkedList<String> Seats=new LinkedList<>();
	ArrayList<String> arr=new ArrayList<>();
	static ArrayList<String> A=new ArrayList<>();
	static ArrayList<String> B=new ArrayList<>();
	static ArrayList<String> C=new ArrayList<>();
	static ArrayList<String> D=new ArrayList<>();
	static ArrayList<String> E=new ArrayList<>();
	Theatre(){
		
    	for(i=0;i<10;i++)
    	{
	    	A.add("1");
	    	B.add("1");
	    	C.add("1");
	    	D.add("1");
	    	E.add("1");
	    }
    	A.set(2,"0");A.set(6,"0");
    	for(i=0;i<6;i++)
     	{
	    	B.set(i,"0");
     	}
	    for(i=0;i<10;i++)
      	{
		   if(i%2!=0)C.set(i,"0");
	    }
    	for(i=0;i<10;i++)
    	{
	    	if(i%2==0)E.set(i,"0");
    	}
    	for(i=0;i<10;i++)
    	{
    		if(A.get(i)=="0")
    		{
    			Seats.add("A" + (i+1));
    			System.out.print("A" + (i+1) + " ");
    			
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(B.get(i)=="0")
    		{
    			Seats.add("B" + (i+1));
    			System.out.print("B" + (i+1) + " ");
    			
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(C.get(i)=="0")
    		{
    			Seats.add("C" + (i+1));
    			System.out.print("C" + (i+1) + " ");
    			
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(D.get(i)=="0")
    		{
    			Seats.add("D" + (i+1));
    			System.out.print("D" + (i+1) + " ");
    			
    		}
    	}
    	for(i=0;i<10;i++)
    	{
    		if(E.get(i)=="0")
    		{
    			Seats.add("E" + (i+1));
    			System.out.print("E" + (i+1) + " ");
    			
    		}
    	}
    	System.out.println("\n\nNumber of Seats Available : " + Seats.size());
	}
	void Seat_selection(int x)
	{
		System.out.println("Select the seats");
		for(i=0;i<x;i++)
		{
			arr.add(sc.next());
			while(!(Seats.contains(arr.get(i))))
			{
				System.out.println("!! Select Appropriate Seat !!");
				arr.remove(i);
				arr.add(sc.next());
			}
			if((arr.get(i).charAt(0)=='A'))
			{
				A.remove(((int)(arr.get(i).charAt(1))-49));
				A.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='B'))
			{
				B.remove(((int)(arr.get(i).charAt(1))-49));
				B.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='C'))
			{
				C.remove(((int)(arr.get(i).charAt(1))-49));
				C.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='D'))
			{
				D.remove(((int)(arr.get(i).charAt(1))-49));
				D.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
			if((arr.get(i).charAt(0)=='E'))
			{
				E.remove(((int)(arr.get(i).charAt(1))-49));
				E.add(((int)(arr.get(i).charAt(1))-49),"1");
			}
		}
	}
}
class ShowTime {
	
	int a;
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,String> HM=new HashMap<>();
	ShowTime(){
		
		System.out.println("1) 11:00 AM \n2) 03:00 PM \n3) 07:00 PM \n4) 11:00 PM");
		a=sc.nextInt();
		while(a!=1 && a!=2 && a!=3 && a!=4)
		{
			System.out.println("!! Choose the Correct Timing !!");
			System.out.println("1) 11:00 AM \n2) 03:00 PM \n3) 07:00 PM \n4) 11:00 PM");
			a=sc.nextInt();
		}
		HM.put(1,"11:00 AM");
		HM.put(2,"03:00 PM");
		HM.put(3,"07:00 PM");
		HM.put(4,"11:00 PM");
		
	}
	
	String MovieTime()
	{
		return (HM.get(a));
	}
	
}
class Payment {
	
	Scanner sc=new Scanner(System.in);
	String name,PhNo;
	int y,i;
	Payment(int x,String t,ArrayList<String> arr)
	{
		System.out.println("Total Fare Rs." + (x*200) + "/- Only....!!");
		System.out.println("Press '1' to Continue Booking \nPress '2' to Terminate Booking");
		y=sc.nextInt();
		sc.nextLine();
		if(y==1)
		{
			System.out.println("Enter Your Name");
			name=sc.nextLine();
			System.out.println("Enter Your Mobile Number");
			PhNo=sc.nextLine();
			System.out.println("Your Entered Details \nName              : " + name + "\nMobile Number     : " + PhNo);
			System.out.print("Movie Timing      : " + t + "\nTotal Seats       : " + x + "\nSelected Seats    : ");
			for(i=0;i<x;i++)
			{
				System.out.print(arr.get(i) + " ");
			}
			System.out.println("\nAmount to be Paid : " + (x*200) + "\nEnter the Amount to Confirm the Seats booking");
			i=sc.nextInt();
			while(i!=(x*200))
			{
				System.out.println("!! Invalid Amount !!\nEnter " + (x*200));
				i=sc.nextInt();
			}
			System.out.println("Tickets Booked Successully\n\nThank You.....!\n vist again !!!");
		}
		else
		{
			System.out.println("Booking Terminated\n\nThank You......!");
		}
	}
}

public class movie_ticket {

	public static void main(String[] args) {
		
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println(">>>> *** WELCOME TO ROCKERS THEATRE *** <<<<");
		System.out.println("Are you Admin or User? \nIf Admin press 'A' if User press 'U'");
		char ch=sc.next().charAt(0);
		while(ch!='A' && ch!='U')
		{
			System.out.println("!! Incorrect Option, Choose Correct Option !!");
			System.out.println("Are you Admin or User? \nIf Admin press 'A' if User press 'U'");
			ch=sc.next().charAt(0);
		}
		String s,s1;
		switch (ch)
		{
		case 'A':
		{
			System.out.println("Do you want to update your password? \nIf yes press 'Y', if no press 'N'");
			ch=sc.next().charAt(0);
			while(ch!='Y' && ch!='N')
			{
				System.out.println("!! Incorrect Option, Choose Correct Option !!");
				System.out.println("Do you want to update your password? \nIf yes press 'Y', if no press 'N'");
				ch=sc.next().charAt(0);
			}
			if(ch=='Y')
			{
				System.out.println("Enter Old Password");
				sc.nextLine();
				s=sc.nextLine();
				System.out.println("Enter New Password");
				s=sc.nextLine();
				System.out.println("Re-Enter New Password");
				s1=sc.nextLine();
				while(!(s.equals(s1)))
				{
					System.out.println("!! Password Not Matched !!");
					System.out.println("Re-Enter Old Password");
					s=sc.nextLine();
					System.out.println("Enter New Password");
					s=sc.nextLine();
					System.out.println("Re-Enter New Password");
					s1=sc.nextLine();
				}
				System.out.println("Password Updated Successfully");
			}
			else
			{
				System.out.println("Exited successfully");
			}
			break;
			
		}
		case 'U':
		{
			System.out.println("Select the Show time: ");
			ShowTime time=new ShowTime();
			System.out.println("Available Seats:");
			Theatre seat=new Theatre();
			System.out.println("\nHow Many Seats Do You Want to Book?");
			x=sc.nextInt();
			seat.Seat_selection(x);
			new Payment(x,time.MovieTime(),seat.arr);
			break;
		}
		}
        sc.close();
	}
}