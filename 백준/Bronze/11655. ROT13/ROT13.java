import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		char[] inp = br.readLine().toCharArray();
		for(char c : inp) {
			if(c >= 'a' && c <= 'z') {
				sb.append((char)((c + 13 - 'a') % 26 + 'a'));
			} else if(c >= 'A' && c <= 'Z') {
				sb.append((char)((c + 13 - 'A') % 26 + 'A'));
			} else{
				sb.append(c);
			}
		}
		
		bw.write(sb.toString());
		
		bw.flush();
		bw.close();
	}

}