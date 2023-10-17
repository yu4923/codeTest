import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		char[] inputArray = input.toCharArray();
		List<Stack<Character>> inpList = new ArrayList<>();
		Queue<String> miniword = new LinkedList<>();
		
		int index = 0;
		Stack<Character> stk = new Stack<>();
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] == '<') {
				if(stk.size() > 0) {
					Stack<Character> stk2 = new Stack<>();
					stk2.addAll(stk);
					inpList.add(stk2);
					stk.removeAll(stk);
				}
				index = 1;
				StringBuilder sb = new StringBuilder();
				sb.append('<');
				for(int j = i + 1; j < inputArray.length; j++) {
					if(inputArray[j] == '>') {
						sb.append('>');
						break;
					} else {
						index += 1;
						sb.append(inputArray[j]);
					}
				}
				i += index;
				miniword.add(sb.toString());
				Stack<Character> stk2 = new Stack<>();
				stk2.add('@');
				inpList.add(stk2);
			} else {
				if(inputArray[i] == ' ') {
					if(stk.size() > 0) {
						Stack<Character> stk2 = new Stack<>();
						stk2.addAll(stk);
						inpList.add(stk2);
						stk.removeAll(stk);
					}
					Stack<Character> stk2 = new Stack<>();
					stk2.add(' ');
					inpList.add(stk2);
				} else {
					stk.add(inputArray[i]);
				}
			}
		}
		if(stk.isEmpty() != true)
			inpList.add(stk);
		
		for(Stack<Character> stk2 : inpList) {
			char c = stk2.peek();
			switch(c) {
			case '@':
				bw.write(miniword.poll());
				break;
			case ' ':
				bw.write(" ");
				break;
			default:
				StringBuilder sb = new StringBuilder();
				while(stk2.isEmpty() != true) {
					sb.append(stk2.pop());
				}
				bw.write(sb.toString());
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}

}