import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[][] arr = new int[t][];
		
		for(int i = 0; i < t; i++) {
			String[] inp = br.readLine().split(" ");
			int n = Integer.parseInt(inp[0]);
			int[] in = new int[n];
			for(int j = 0; j < n; j++) {
				in[j] = Integer.parseInt(inp[j + 1]);
			}
			arr[i] = in;
		}
		
		for(int[] inArr : arr) {
			long sum = 0;
			for(int i = 0; i < inArr.length; i++) {
				for(int j = i + 1; j < inArr.length; j++) {
					sum += gcd(inArr[i], inArr[j]);
				}
			}
			sb.append(sum + "\n");
		}
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}
	
	static int gcd(int a, int b) {
		int gcd = 0;
		while(a != b && a * b != 0) {
			int comp = a;
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