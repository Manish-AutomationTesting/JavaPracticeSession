package javaBasics;

public class FactorialConcept {

	public static void main(String[] args) {
		System.out.println("Factorial of 6="+isFactorialNumber(6));

	}
//factorial
	//fact 0=1
	//fact 1=1
	//fact 5=5*4*3*2*1
	//fact 6=6*5*4*3*2*1
	public static int isFactorialNumber(int num){
		int fact=1;
		if(num==0){
			return 1;
		}
		for (int i=2; i<=num; i++){
			fact=fact*i;
			
		}
		return fact;
		
	}
	
}
