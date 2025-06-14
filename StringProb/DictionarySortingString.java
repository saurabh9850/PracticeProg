package StringProb;

public class DictionarySortingString {

	public static void main(String[] args) {
		String s1="hi welcome to hefshine";
		String []sa=s1.split(" ");
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].compareTo(sa[j])>0)
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println(sa[0]);
		System.out.println(sa[sa.length-1]);

	}

}
