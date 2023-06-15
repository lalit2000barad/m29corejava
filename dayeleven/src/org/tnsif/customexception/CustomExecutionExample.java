package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExecutionExample {

	public static void main(String[] args) throws LoginCredential {
		// TODO Auto-generated method stub

		
		Scanner s= new Scanner(System.in);
		String id=s.nextLine();
		String password =s.nextLine();
	try {	
		if(id.equals("v@gmail.com")&&
				password.equals("pass@123"))
		
		{
			System.out.println("Credential  is matched");
		}
		else
		{
			throw new LoginCredential ("invalid credentials");
		}
	}
		catch(LoginCredential e)
		{
			System.out.println("Exception handeled" + e);
		}
	}

}
