import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder result = new StringBuilder();
		
		List<Integer> input = new ArrayList<>();
		int max = 0;
		while(true) {
			int inp = Integer.parseInt(br.readLine());
			if(inp - 0 == 0)
				break;
			if(max < inp)
				max = inp;
			input.add(inp);
		}
		
		boolean[] primeNumber = new boolean[max + 1];
		primeNumber[0] = true;
		primeNumber[1] = true;
		double m = Math.sqrt(max);
		for(int i = 2; i <= m; i++) {
			if(primeNumber[i])
				continue;
			for(int j = i; i * j < max + 1; j++) {
				primeNumber[i * j] = true;
			}
		}
		
		for(int num : input) {
			boolean isGB = false;
			for(int i = 2; i <= num / 2; i++) {
				if(!primeNumber[i] && !primeNumber[num - i]) {
					result.append(num + " = " + i + " + " + (num - i) + "\n");
					isGB = true;
					break;
				}
			}
			if(!isGB)
				result.append("Goldbach's conjecture is wrong.\n");
		}
		
		bw.write(result.toString());
		
		bw.flush();
		bw.close();
	}

}