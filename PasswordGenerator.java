import java.util.*;
import java.util.Scanner;

public class PasswordGenerator
{
	public static void main(String[] args) 
	{
	    try (Scanner len = new Scanner(System.in)) {
			System.out.println("Enter your password Length");

			int length = len.nextInt(); 
			System.out.println("Your Password is: " + length + " Legnth"); 
			// int length = 10;
			System.out.println(Passwordgenerator(length));
		}
		
	}

	private static char[] Passwordgenerator(int lenth) {
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";

		String values = Capital_chars + Small_chars +
						numbers + symbols;

		Random rndm_method = new Random();

		char[] password = new char[lenth];

		for (int i = 0; i < lenth; i++)
		{

			password[i] =
			values.charAt(rndm_method.nextInt(values.length()));

		}
        return password;
	}
}

