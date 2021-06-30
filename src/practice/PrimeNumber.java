package practice;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	      
	       int n = s.nextInt(); 
	      if (n==0||n==1)
	    	  System.out.println(n+" is not a prime number");
	      else
	      {
	    	  for(int i=2; i<=(int)Math.sqrt(n);i++)
	    	  {
	    		  if(n%i==0)
	    		  {
	    			  System.out.println(n+" is not a prime number");
	    			  break;
	    			  }    		 
	    	  }
	      }
	    s.close();   
	}

}
