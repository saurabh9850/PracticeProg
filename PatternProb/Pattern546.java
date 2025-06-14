package PatternProb;

public class Pattern546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int end=1;
		 int cnt=1;
		 for(int i=1;i<=5;i++)
		 {int cnt2=cnt;
			 for(int j=1;j<=end;j++)
			 {
				 System.out.print((char)(cnt2+64));
				 cnt2--;
				 
				 
				 
			 }
			 System.out.println();
			 cnt++;
			 end++;
			 
		 }

	}

}
