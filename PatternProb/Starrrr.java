package PatternProb;

public class Starrrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=start)
				System.out.print(" ");
				else 
					System.out.print("*");
				
			}
			System.out.println();
			if(i<5)
				start++;
			else
				start--;
			
		}

	}

}
