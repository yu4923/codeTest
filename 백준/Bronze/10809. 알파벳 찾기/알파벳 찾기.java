import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int[] location = new int[26];
		
		for(int i = 0; i < 26; i++) {
			location[i] = -1;
		}
		
		char[] inp = br.readLine().toCharArray();
		for(int i = 0; i < inp.length; i++) {
			if(location[inp[i] - 'a'] == -1) {
				location[inp[i] - 'a'] = i;
			}
		}
		
		for(int i : location) {
			sb.append(i + " ");
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}

}