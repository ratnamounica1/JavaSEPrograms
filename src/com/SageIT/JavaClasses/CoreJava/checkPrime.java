package com.SageIT.JavaClasses.CoreJava;

public class checkPrime {
	public boolean isPrime(int num){
		checkPrime ch=new checkPrime();
		for (int i=2;i<=num;num++){
			if(num%i==0){
			return false;
			}
		}
			
		return true;
	}
	
}
