package PatternProb;

public class Starpatter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=9;
		int spacecnt=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=end)
				{
					System.out.println(" ");
				}
				else {
					System.out.println("*");
				}
				
			}
			System.out.println();
			if(i<5)
			{
				end--;
				spacecnt++;
			}
			else
			{
				end++;
				spacecnt--;
			}
			
		}
	}

}
