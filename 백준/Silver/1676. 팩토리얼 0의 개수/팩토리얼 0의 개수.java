import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int cntTwo = 0;
		int cntFive = 0;
		
		for(int i = 2; i <= n; i++) {
			int num = i;
			while(num % 2 == 0) {
				cntTwo += 1;
				num /= 2;
			}
			while(num % 5 == 0) {
				cntFive += 1;
				num /= 5;
			}
		}
		
		bw.write(Integer.toString(cntTwo > cntFive ? cntFive : cntTwo));
		
		bw.flush();
		bw.close();
	}

}