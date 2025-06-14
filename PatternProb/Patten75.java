package PatternProb;

public class Patten75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=3;i<=9;i=i+2)
	{
		for(int j=1;j<=i;j++)
		{
			if(j*2-1==i)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println();
	}
	}

}
