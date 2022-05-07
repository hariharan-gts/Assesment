package t1_07_05_2022;

public class stairs {

	public static void main(String[] args) {
		int n=5;
		int t1=0,t2=1,t3=0;
		for(int i=0;i<n;i++) {
			t3=t1+t2;
			t1=t2;
			t2=t3;
		}
		System.out.println(t3);

	}

}
