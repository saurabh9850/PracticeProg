package PatternProb;

public class Starpaat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hash1=4;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=hash1)
				{
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
			if(i<5)
			{
				hash1--;
			}
			else {
				
				hash1++;
			}
			
		}
		

	}

}
