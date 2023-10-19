import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<String> inp = new ArrayList<>();
		String s = " ";
		
		while((s = br.readLine()) != null) {
			inp.add(s);
		}
		
		int[][] ans = new int[inp.size()][4];
		for(int i = 0; i < inp.size(); i++) {
			char[] arr = inp.get(i).toCharArray();
			for(char c : arr) {
				if(c >= 'a' && c <= 'z') {
					ans[i][0] += 1;
				} else if(c >= 'A' && c <= 'Z') {
					ans[i][1] += 1;
				} else if(c >= '0' && c <= '9') {
					ans[i][2] += 1;
				} else if(c == ' ') {
					ans[i][3] += 1;
				}
			}
		}
		
		for(int[] arr : ans) {
			StringBuilder sb = new StringBuilder();
			for(int i : arr) {
				sb.append(i + " ");
			}
			bw.write(sb.toString());
		}
		
		bw.flush();
		bw.close();
	}

}