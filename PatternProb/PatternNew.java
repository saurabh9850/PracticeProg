package PatternProb;

public class PatternNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=8;
		int cnt=1;
		 for(int i=1;i<=9;i++)
		 {  int cnt2=cnt;
			 for(int j=1;j<=9;j++)
			 {
				 if(j<=space)
				 {
					 System.out.print(" ");
				 }
				 else
				 {
					 System.out.print(cnt2+" ");
					 cnt2++;
				 }
			 }
			 System.out.println();
			 space--;
			 
			 
		 }

	}

}
