package PatternProb;

public class NumberPaatterrnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  int space=0;
		  int cnt=1;int end=5;
		  for(int i=1;i<=9;i++)
		  {
			  int cnt2=cnt;
			  for(int j=1;j<=5;j++) 
			  {
				  if(j<=space)
				  { System.out.print(" ");
				  }
				  
			  else
					  {
					  System.out.print(cnt2+ " ");
					  cnt2++;
					  }
		       }
		  System.out.println();
		  if(i<5)
		  {
			  space++;
			  end--;
			  cnt++;
		  }
		  else
		  {
			  space--;
			  end++;
			  cnt--;
			  
			  
		  }
		  
		  
		  }

	}

}
