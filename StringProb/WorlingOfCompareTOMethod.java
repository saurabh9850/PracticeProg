package StringProb;

public class WorlingOfCompareTOMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hefshine";
		String s2="hefabc";
		int cnt=0;
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for(int i=0;i<Math.min(s1.length(), s2.length());i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				continue;
			}
			else
			{
				cnt++;
				System.out.println(s1.charAt(i)-s2.charAt(i));
				break;
			}
			
		}
		if(cnt==0) {
			System.out.println(s1.length()-s2.length());
		}
		

	}

}
