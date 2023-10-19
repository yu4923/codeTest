import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		Long s = Long.parseLong(str[1]);
		String[] loc = br.readLine().split(" ");
		long[] longLoc = new long[n];
		
		for(int i = 0; i < n; i++) {
			long loca = Long.parseLong(loc[i]);
			longLoc[i] = loca > s ? loca - s : s - loca;
		}
		
		long answer = longLoc[0];
		for(int i = 1; i < n; i++) {
			answer = gcd(answer, longLoc[i]);
		}
		
		bw.write(Long.toString(answer));
		
		bw.flush();
		bw.close();
	}
	
	static long gcd(long a, long b) {
		long gcd = 0;
		while((a - b) * a * b != 0) {
			long comp = a;
			a = a % b;
			b = b % comp;
		}
		if(a - b == 0)
			gcd = a;
		else
			gcd = a + b;
		return gcd;
	}

}