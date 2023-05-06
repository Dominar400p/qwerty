package pattern;

public class cdp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		int sum,count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				sum=a[i]+a[j];
				if(sum==7) {
					
					count++;
					
				}
			}
		}
		System.out.println("count of pair is:"+ count);

	}

}
