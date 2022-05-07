package t1_07_05_2022;

public class can_place_flowers {
    public static boolean can(int a[],int n,int k) {
    	for(int i=0;i<n;i++) {
    		if(k==0)
    			return true;
    		if(poss(a,n,i))
    			k--;
    	}
    	
    	return false;
    }
    public static boolean poss(int a[],int n,int i) {
    	int bf=i==0?i:i-1;
    	int af=i==n-1?i:i+1;
    	return a[bf]==0&&a[af]==0;
    }
	public static void main(String[] args) {
		int n=5;
		int a[]= {1,0,0,0,1};
		int k=1;
		System.out.println(can(a,n,k));

	}

}
