package PatternProb;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int end=1;
		int cnt=1;
   for(int i=1;i<=6;i++)
   {  int cnt2=cnt;
	   for(int j=1;j<=end;j++)
	   {
		   System.out.print((char)(cnt2+64));
		   cnt2=cnt2+5;
		   
	   }
	   System.out.println();
	   cnt++;
	   end++;
	   
   }

	}

}
