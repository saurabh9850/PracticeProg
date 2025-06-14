package StringProb;

public class StringRevese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="you are all very very very good students";
		
		String []a=s1.split(" ");
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			String temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
		}
		String s2="";
		for(int i=0;i<a.length;i++)
		{
			s2=s2+a[i]+" ";
		}
		System.out.println(s2);
	}

}
