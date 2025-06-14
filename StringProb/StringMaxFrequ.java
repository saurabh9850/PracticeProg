package StringProb;

public class StringMaxFrequ {

	public static void main(String[] args) {
		String s1="abcdabdddd";
		int max=Integer.MIN_VALUE;
		char ch=0;
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					cnt++;
			}
			int frecnt=0;
			if(cnt==0)
			{
				for(int j=0;j<s1.length();j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						frecnt++;
					}
				}
			}
			if(frecnt>max)
			{
				max=frecnt;
				ch=s1.charAt(i);	
			}
		}
		System.out.println(ch+" "+max);

	}

}
