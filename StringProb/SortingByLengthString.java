package StringProb;
import java.util.Arrays;

public class SortingByLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa= {"hi","welcome","hefshine","to"};
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(sa));

	}

}
