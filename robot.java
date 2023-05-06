package pattern;
import java.util.Scanner;
public class robot {
	public static void move(String a) {
		int a1=0,b1=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='U') {
				a1++;}
			else if(a.charAt(i)=='D') {
				a1--;
			}
			else if(a.charAt(i)=='L') {
				b1--;
			}
			else if(a.charAt(i)=='R') {
				b1++;
			}
				
				
			}
		System.out.println(a1+" "+b1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input String");
		String b=sc.next();
		
robot.move(b);
	}

}
