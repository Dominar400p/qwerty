package pattern;
import java.util.Arrays;

public class cdp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A[]= {0,2,5,8};
int B[]= {1,6,7};
int temp=0	;
for(int i=0;i<=B.length-1;i++) {
	for(int j=0;j<=A.length-1;j++) {
		if(B[i]<A[j]) {
			for(int k=0;k<A.length;k++) {
				if(A[j]<A[k]) {
				temp=A[j];
				A[j]=A[k];
				A[k]=temp;
			}
		}
		int temp1=0;
		temp1=A[j];
		A[j]=B[i];
		B[i]=temp1;
	}
}
	}
Arrays.sort(B);
System.out.println("First array elements");
for(int i:A) {
	
	System.out.println(i);
	
}
System.out.println("First array elements");
for(int j:B) {
	
	System.out.println(j);
	
}
	}
	

}
