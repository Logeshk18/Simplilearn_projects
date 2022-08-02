package longest_increase_sub;
import java.util.Scanner;
 
 public class Longest_inc_subsequence {

    static int LIS(int arr[], int n)
    {
        int temp[]=new int[n];
        int i,j,max=0;
 
        for(i=0;i<n;i++)
        {
            temp[i]=1;
        }
        for(i=1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if (arr[i]>arr[j] && temp[i]<(temp[j]+1))
                {
                    temp[i]=temp[j]+1;
                }
            }
        }   
        for (i=0;i<n;i++)
        {
            if (max<temp[i])
            {
                max=temp[i];
            }
        }
        return max;
    }
 
    public static void main(String args[])
    {
    	int a;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the no. of elements to be added in the sequence");
    	a=sc.nextInt();
        int arr[] =new int[a];
        System.out.println("Enter the elements");
        
        for(int i=0;i<a;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        System.out.println("Length of LIS is " + LIS(arr, a));
        sc.close();
    }
}
