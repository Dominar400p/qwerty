package pattern;

public class cdp2 {

	public static void main(String[] args) {
		int a[]= {34,28,38,20};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		System.out.println("Second smallest number in an array is"+a[1]);
		for(int j: a) {
			System.out.println("sorted array is "+j);
		}
		// TODO Auto-generated method stub

	}

}
