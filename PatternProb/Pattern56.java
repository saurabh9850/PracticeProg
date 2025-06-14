package PatternProb;

public class Pattern56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=1;
		 int cnt=1;
		 for(int i=1;i<=5;i++)
		 {int cnt2=cnt;
		    int diff=4;
			 for(int j=1;j<=end;j++)
			 {  
				 System.out.print(cnt2+" ");
				 cnt2=cnt2+diff;
				 diff--;
				 
				 
				 
			 }
			 System.out.println();
			 cnt++;;
			 end++;
			 
		 }
	}

}
