import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][];
		
		for(int i = 0; i < n; i++) {
			arr[i] = br.readLine().split(" ");
		}
		
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(arr[i][0]);
			int b = Integer.parseInt(arr[i][1]);
			
			while(a * b != 0) {
				int comp = a;
				a = a % b;
				b = b % comp;
				if(a + b == 0) {
					b = comp;
				}
			}
			result.append(Integer.parseInt(arr[i][0]) * Integer.parseInt(arr[i][1]) / (a + b) + "\n");
		}
		
		bw.write(result.toString());
		
		bw.flush();
		bw.close();
	}

}