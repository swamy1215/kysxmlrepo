package com.klu.cse;
import java.util.*;

public class PrimeEx 
{
 boolean isPrime(int x)
{
	if(x<=1)
		return false;
	// Check from 2 to n-1 
    for (int i = 2; i < x; i++) 
        if (x % i == 0) 
            return false; 

    return true; 
}

   
    /*public static void main(String args[]) 
    { 
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter the value of X");
    	int x=in.nextInt();
    	
        if (isPrime(x)) 
            System.out.println(" It is Prime number"); 
        else
            System.out.println(" It is not a prime number"); 
        
    } */
} 