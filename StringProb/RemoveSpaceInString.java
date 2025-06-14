package StringProb;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1="   hef  shine  soft  ";
		 s1=s1.trim();
		 String s2="";
		 for(int i=0;i<s1.length();i++)
		 {
			 if(s1.charAt(i)==' '&& s1.charAt(i+1)==' ')
			 {
				 continue;
			 }
			 else
				 s2=s2+s1.charAt(i);
			 
		 }
		 System.out.println(s2);

	}

}
