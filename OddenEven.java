

import java.util.Scanner;
  public class Main{
	
public static void main( String[] args){
		Scanner input=new Scanner(System.in);
		
    int num;
		System.out.print("Enter the num: ");
		num=input.nextInt();
		
  if ( num % 2 == 0){
			System.out.println("Even Number");
	}
  
  else 
			System.out.println("Odd Number");
	}
}
