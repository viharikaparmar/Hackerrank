
public class Problem1 {

	public static void main(String[] args) {

		int ar[] = { 10, 20, 20, 10, 10, 30, 50,10, 20 };
		int count = 0;

		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {

				if (ar[i] == 0)
					break;
				else {
					if(ar[i]==ar[j]) {
						count++;
						ar[i]=0;
						ar[j]=0;	
					}
						
				}
			}
		}
		System.out.println(count);

	}

}
