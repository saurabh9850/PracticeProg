package PatternProb;

public class Patternnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int end=5;
		   int space=4;
		   for(int i=1;i<=5;i++)
		   { int cnt=1;
			   for(int j=1;j<=end;j++)
			   {
				   if(j<=space)
				   {
					   System.out.print(" ");
				   }
				   else {
					   System.out.print(cnt);
				   if(j<5)
				   {
					   cnt++;
				   }
				   else
				   {
					   cnt--;
				   }
				   }
			   }
			   System.out.println();
			   end++;
			   space--;

			   
		   }
		   
	}

}
