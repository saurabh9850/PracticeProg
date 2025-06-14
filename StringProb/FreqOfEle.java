package StringProb;

public class FreqOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdabcd";
		boolean a[]= new boolean[s.length()];
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			if(a[i])
			{
				continue;
			}
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					a[j]=true;
					cnt++;
				}
			}
			System.out.println(s.charAt(i)+" "+cnt);
			cnt=0;
			
			
		}

	}

}
