package StringProb;

public class OurLogicTrime {

	public static void main(String[] args) {
		//java method

		String s1="   hefshine   ";
		System.out.println(s1.trim());
		int start=-1;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				continue;
			}
			else {
				start=i;
				break;

			}

		}
		int end=-1;
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(s1.charAt(i)==' ')
				continue;
			else {
				end=i;
				break;

			}

		}
		for(int i=start;i<=end;i++)
		{
			System.out.print(s1.charAt(i));
		}

	}

}
