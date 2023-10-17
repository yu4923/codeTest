import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] answer = new int[arr.length];
		Stack<int[]> stk = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			int[] inArr = {i, Integer.parseInt(arr[i])};
			while(stk.isEmpty() != true) {
				int[] comp = stk.pop();
				if(comp[1] < inArr[1]) {
					answer[comp[0]] = inArr[1];
				} else {
					stk.add(comp);
					break;
				}
			}
			stk.add(inArr);
		}
		
		while(stk.isEmpty() != true) {
			int[] num = stk.pop();
			answer[num[0]] = -1;
		}
		
		String ans = Arrays.toString(answer);
		bw.write(ans.substring(1, ans.length() - 1).replace(",", ""));
		
		bw.flush();
		bw.close();
	}

}