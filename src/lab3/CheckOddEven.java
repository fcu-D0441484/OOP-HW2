package lab3;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("Enter a integer:");
		a=new Scanner(System.in).nextInt();
		if(a%2==0)
			System.out.println("The input integer is Even Number.");
		else
			System.out.println("The input integer is Odd Number.");
	//	(a%2==0)?System.out.println("The input integer is Even Number."):System.out.println("The input integer is Odd Number.");
	}

}
