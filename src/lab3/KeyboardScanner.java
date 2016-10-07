package lab3;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		float b,c;
		String name;
		System.out.println("Enter a integer:");
		a=new Scanner(System.in).nextInt();
		System.out.println("Enter a float point number:");
		b=new Scanner(System.in).nextFloat();
		System.out.println("Enter your name :");
		name=new Scanner(System.in).nextLine();
		c=a*b;
		System.out.printf("Hi %s,the multiplication of %d and %f is %.2e",name,a,b,c);
	}

}
