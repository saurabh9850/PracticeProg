package StringProb;

public class Working2ndWayCompare {

	private int MycomapreToIgnore(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for(int i=0;i<s1.length()&& i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
					
		}
		return s1.length()-s2.length();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Working2ndWayCompare r1=new Working2ndWayCompare();
		int hef=r1.MycomapreToIgnore("Saurabh" ,"Ajay");
		System.out.println(hef);
		
		
	}

}
