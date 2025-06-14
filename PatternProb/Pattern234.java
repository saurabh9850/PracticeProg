package PatternProb;

public class Pattern234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int fend=1;
    int sec=10;
    int cnt=1;
    int cnt3=1;
    
    
    for(int i=1;i<=5;i++)
    { int cnt2=cnt;
    int cnt4=cnt3;
      
    
    	for(int j=1;j<=10;j++)
    	{
    		if(j<=fend || j>=sec)
    		{
    			System.out.print(cnt2);
    			cnt2++;
    		}
    		else
    		{
    			System.out.print(" ");
    		}
    		if(j>=sec)
    		{
    			System.out.print(cnt4);
    			cnt4--;
    			
    			
    		}
    	}
    	System.out.println();
    	fend++;
    	sec--;
    	cnt3++;
    }
	}

}
