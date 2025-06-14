package PatternProb;

public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space = 4;
		int cnt = 0;
		for (int i = 1; i <= 5; i++)

		{
			int cnt2 = 1;
			cnt2 = cnt2 + cnt;

			for (int j = 1; j <= 5; j++) {
				if (j <= space) {
					System.out.print(" ");
				} else {
					System.out.print(cnt2);
					cnt2--; 
				}

			}
			System.out.println();
			space--;
			cnt++;
		}

	}

}
