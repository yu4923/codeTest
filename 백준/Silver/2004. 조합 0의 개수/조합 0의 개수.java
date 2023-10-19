import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] inp = br.readLine().split(" ");
		int[] ten = new int[2];
		Long n = Long.parseLong(inp[0]);
		Long m = Long.parseLong(inp[1]);
		Long k = n - m;
		
		for(long i = 2; i <= n; i *= 2) {
			ten[0] += n / i - m / i - k / i;
		}
		for(long i = 5; i <= n; i *= 5) {
			ten[1] += n / i - m / i - k / i;
		}
		
		bw.write(Integer.toString(ten[0] < ten[1] ? ten[0] : ten[1]));
		
		bw.flush();
		bw.close();
	}

}