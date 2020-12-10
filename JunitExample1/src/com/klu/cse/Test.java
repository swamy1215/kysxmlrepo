package com.klu.cse;

import static org.junit.Assert.*;

public class Test 
{

	@org.junit.Test
	public void test()
	{
		PrimeEx obj=new PrimeEx();
		//PrimeEx.isPrime(5);
		assertTrue(obj.isPrime(5));
		
	}
	@org.junit.Test
	public void testF()
	{
		//PrimeEx.isPrime(5);
		PrimeEx obj=new PrimeEx();
		assertFalse(obj.isPrime(6));
		
	}
	
	@org.junit.Test
	public void testF2()
	{
		//PrimeEx.isPrime(5);
		PrimeEx obj=new PrimeEx();
		assertFalse(obj.isPrime(0));
		
	}
   

}
