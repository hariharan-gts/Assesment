package t1_07_05_2022;

public class jewel_stone {

	public static void main(String[] args) {
		String j="aA";
		String s="aAAbbb";
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(j.indexOf(s.charAt(i))!=-1)
				cnt++;
		}
		System.out.println(cnt);

	}

}
