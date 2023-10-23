import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		char[] cArr = br.readLine().toCharArray();
		
		for(char c : cArr) {
			int n = c - '0';
			int coef = 4;
			while(coef > 0) {
				sb.append(n / coef);
				n %= coef;
				coef /= 2;
			}
		}
		
		while(sb.indexOf("0") == 0 && sb.length() > 1) {
			sb.replace(0, 1, "");
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}

}