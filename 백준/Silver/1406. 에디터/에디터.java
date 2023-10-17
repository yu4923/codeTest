import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] input = br.readLine().toCharArray();
		int m = Integer.parseInt(br.readLine());
		
		Stack<Character> beforeCursor = new Stack<>();
		Stack<Character> afterCursor = new Stack<>();
		for(char c : input) {
			beforeCursor.add(c);
		}
		
		for(int i = 0; i < m; i++) {
			char[] order = br.readLine().toCharArray();
			switch(order[0]) {
			case 'L':
				if(beforeCursor.isEmpty() == false)
					afterCursor.add(beforeCursor.pop());
				break;
			case 'D':
				if(afterCursor.isEmpty() == false)
					beforeCursor.add(afterCursor.pop());
				break;
			case 'B':
				if(beforeCursor.isEmpty() == false)
					beforeCursor.pop();
				break;
			case 'P':
				beforeCursor.add(order[2]);
				break;
			default:
				break;
			}
		}
		
		for(char c : beforeCursor)
			bw.write(c);
		while(afterCursor.isEmpty() == false)
			bw.write(afterCursor.pop());
		
		bw.flush();
		bw.close();
	}

}