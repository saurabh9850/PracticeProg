package PatternProb;

public class Pattern1122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=5;
		int space=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			end++;
			space--;
		}

	}

}
