package pattern;

public class cdp1 {
	public static void get(int A[]) {
		int size=A.length-1;
		int temp=0;;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				while(A[size]%2==0 && size>0) {
					size--;
				}
				if(size<=i) break;
				temp=A[size];
				A[size]=A[i];
				A[i]=temp;
			}
		}
		for(int j:A) {
			System.out.println(j);
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {3,5,6,8,1};
		cdp1.get(array);

	}

}
