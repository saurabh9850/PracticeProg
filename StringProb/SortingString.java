package StringProb;
import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Saurabh9850@";
		String s2="";
		String s3="";
		String s4="";
		char a[]=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if((a[i]>='A'&& a[i]<='Z')||(a[i]>='a'&&a[i]<='z'))
					{
				s2=s2+a[i];
					}
			else if(a[i]>='0'&&a[i]<='9')
			{
				s3=s3+a[i];
			}
			else
			{
				s4=s4+a[i];
			}
				
		}

		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		Arrays.sort(a);
		System.out.println(a.toString());
		

	}

}
