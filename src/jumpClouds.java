
public class jumpClouds {

	public static void main(String[] args) {

		int c[] = { 0, 0, 1, 0, 0, 1, 0 };
		int jumps = 0;

		for (int i = 0; i < c.length-1; i++) {

				if ((c[i] == 0)) {
					if(c[i+1]==0) {
						if(i!=c.length-2) {
							if(c[i+2]==0) {
								jumps++;
								i=i+1;
							}
							else 
								jumps++;
						}
						else
							jumps++;
					}
					else {
						jumps++;
						if(i!=c.length-3)
						i=i+1;
					}

			}
		}
		System.out.println(jumps);

	}

}
