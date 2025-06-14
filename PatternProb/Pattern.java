package PatternProb;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int end=1;
		   int cnt=1;
		   for(int i=1;i<=6;i++)
		   {  int cnt2=cnt;
			   for(int j=1;j<=end;j++)
			   {
				   System.out.print(cnt2);
				   cnt2++;
			   }
			   System.out.println();
			   int diff=1;
			   cnt=cnt+diff;
			   diff++;
			   end++;
		   }

	}

}
