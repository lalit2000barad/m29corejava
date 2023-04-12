package org.tnsif.functiondemo;

import java.util.Scanner;

public class Recursion {


	
		
		    public static int sumOfDigits(int num) {
		        if (num == 0) {
		            return 0;
		        } else {
		            return (num % 10) + sumOfDigits(num / 10);
		        }
		    }

		    public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
		    	
		    	int num =  s.nextInt();
		    	s.close(); // specify the number whose digits we want to add
		        int result = sumOfDigits(num);
		        System.out.printf("The sum of digits in %d is %d", num, result);
		    }
		

		
		
		

	}


