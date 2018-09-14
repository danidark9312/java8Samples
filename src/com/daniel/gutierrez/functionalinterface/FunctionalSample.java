package com.daniel.gutierrez.functionalinterface;

public class FunctionalSample {
	public static void main(String[] args) {
		FunctionalA fiComplete = (int x,int y)->{return x+y;};
		FunctionalA fi = (x,y)->x+y;
		
		FunctionalB fiMethodReference = String::charAt; 
		//Lo anterior es equivalente a lo siguiente
		FunctionalB fiMethodReferenceB = (a,b)->a.charAt(b);
		
		FunctionalB fiMethodReferenceC = FunctionalSample::join;
		//Lo anterior es equivalente a lo siguiente
		FunctionalB fiMethodReferenceD = (a,b)->FunctionalSample.join(a,b);
		
	}
	
	private static int sumNow (int a, int b) {
		return a+b;	
	}
	
	private static int join(String a, int b) {
		return (a+b).hashCode();
	}
	
}

interface FunctionalA{
	int sum(int a, int b);
	
	
}
interface FunctionalB{
	int concat(String a, int b);
	
	
}

