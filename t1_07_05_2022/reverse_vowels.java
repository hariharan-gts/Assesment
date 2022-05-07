package t1_07_05_2022;

public class reverse_vowels {

	public static void main(String[] args) {
		String s="hello ram";
		String v="",ans="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				v+=s.charAt(i);
		}
		int l=v.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				ans+=v.charAt(l);
				l--;
			}else {
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);
		

	}

}
