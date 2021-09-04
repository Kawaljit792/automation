package practice;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	      int flag=0;
	       int n = s.nextInt(); 
	      if (n==0||n==1) 
	     
	    	  System.out.println(n+" is not a prime number");
	     else
	      {
	    	  for(int i=2; i<=(int)Math.sqrt(n);i++)
	    	  {
	    		  if(n%i==0)
	    		  {
	    			  flag=1;
	    			  }   
	    	    	    		  
	    	  }
	    	  if (flag==1)
	    	      System.out.println(n+" is not a prime number");
	    	      else
	    	    	  System.out.println(n+" is a prime number");
	    	     
	      }
	     
	    s.close();   
	    
	    
	}

}
