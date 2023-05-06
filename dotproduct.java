package pattern;
import java.util.Scanner;


public class dotproduct {
	public static void product(int[] A,int[] B) {
		
		int sum=0;
		try {
			
		
		if(A.length!=B.length)
			throw new Exception("Array must be same size");
		try {
			if(A.length==0 && B.length==0)
				throw new Exception("Arrays can't be zero size");
			for(int i=0;i<=A.length-1;i++) {
				sum=sum+(A[i]*B[i]);
			}
			System.out.println(sum);
		}
		catch(Exception g) {
			System.out.println(g.getMessage());
		}}
		
		catch(Exception z){
			System.out.println(z.getMessage());
		}
	}

public static void main(String[] args) {

	int a[]={1,2};
	int b[]= {3,4};
	dotproduct.product(a, b);
	
	
	}

	}


