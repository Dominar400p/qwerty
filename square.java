package pattern;
import java.math.*;
import java.util.Scanner;
public class square {
	public static double square(double b) {
		return Math.sqrt(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double a=sc.nextDouble();
		System.out.println(square.square(a));
	}

}
