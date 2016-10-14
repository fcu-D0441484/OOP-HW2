package lab3;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String one;
		String two;
		while(true)
		{
			System.out.println("Enter string 1:");
			one=new Scanner(System.in).nextLine();
			System.out.println("Enter string 2:");
			two=new Scanner(System.in).nextLine();
			if(one.equalsIgnoreCase(two))
			{
				System.out.println("The two strings are the same.");
				break;
			}
			else
			System.out.println("The two strings are not the same.");
	
		}
	

}
}
