import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack<>();
		
		char[] arr = br.readLine().toCharArray();
		String[] sArr = new String[arr.length];
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(stack.isEmpty()) {
				stack.add(Character.toString(arr[i]));
			} else {
				stack.add(arr[i] + stack.pop());
			}
			sArr[i] = stack.peek();
		}
		
		Arrays.sort(sArr);
		for(String s : sArr) {
			bw.write(s + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}