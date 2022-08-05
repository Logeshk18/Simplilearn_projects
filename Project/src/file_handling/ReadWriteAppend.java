package file_handling;
import java.io.*;
import java.util.Scanner;

public class ReadWriteAppend {

	    public static void main(String[] args) {
			
			try
			{
		    	System.out.println("Enter file location");
			    Scanner sc=new Scanner(System.in);
			    String s=sc.nextLine();
			    File file=new File(s);
			    if(file.createNewFile())
				{
					System.out.println("A new file has been created");
					file(s);
				}
				else
				{
					System.out.println("File already exists !!!");
		        	file(s);
				}
			    sc.close();
			}
			catch(Exception e)
			{
				e.getMessage();
			}

		}

		private static void file(String s) {
			
			try
			{
				Scanner sc=new Scanner(System.in);
				int a=1;
				while(a==1)
				{
				System.out.println("Enter the contents needs to be added into the file (put '/' at the end)");
			    DataInputStream Dis=new DataInputStream(System.in);
			    FileOutputStream Fos=new FileOutputStream(s,true);
	        	BufferedOutputStream Bos=new BufferedOutputStream(Fos,1024);
	        	
		        char c;
	    	    while((c= (char)Dis.read()) !='/')
		        {
			        Bos.write(c);
		        }
	          	Bos.close();
	          	System.out.println("File content: ");
	        	FileInputStream Fis=new FileInputStream(s);
		        int b;
		        while((b=Fis.read())!=-1)
		        {
		         	System.out.print((char) b);
		        }
		        Fis.close();
		        System.out.println("\n If you want to add more content , press 1 (or) 0 to close the file");
		        a=sc.nextInt();
				} 
				
				sc.close();
				
				System.out.println("File closed");
		    	}
		     	catch(Exception e)
			    {
			    	e.getMessage();
			    }
		}

	}
