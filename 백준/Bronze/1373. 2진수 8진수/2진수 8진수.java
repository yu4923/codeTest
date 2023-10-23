import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = br.readLine().toCharArray();
		int coef = 1;
		int num = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length - 1; i >= 0; i--) {
			num += coef * (arr[i] - '0');
			coef *= 2;
			if(coef == 8) {
				sb.insert(0, num);
				num = 0;
				coef = 1;
			}
		}
		
		if(coef != 1) {
			sb.insert(0, num);
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}

}