package PatternProb;

public class PracticePaatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=5;
		  int space=4;
		  
		 
		  for(int i=1;i<=5;i++)
		  { int cnt2=1;
		     
			  for(int j=1;j<=end;j++)
			  {
				  if(j<=space)
				  {
					  System.out.print(" ");
				  }
				  else
					  {
					  System.out.print((char)(cnt2+64));
					    if(j<5)
					    	cnt2++;
					    else
					    	cnt2--;
					    	
					  }
			  }
			  System.out.println();
			  end++;
			  space--;
		  }

	}

}
