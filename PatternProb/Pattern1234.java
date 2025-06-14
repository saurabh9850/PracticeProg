package PatternProb;

public class Pattern1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=5;
		int space=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			if(i<5) 
			{
				end++;
			    space++;
			}
			  else
				  {
				  end--;
				  space--;
		}
		}

	}

}
