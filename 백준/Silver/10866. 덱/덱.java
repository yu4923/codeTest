import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deq = new ArrayDeque<>();
		
		int n = Integer.parseInt(br.readLine());
		String[][] order = new String[n][];
		for(int i = 0; i < n; i++) {
			order[i] = br.readLine().split(" ");
		}
		
		for(String[] arr : order) {
			switch(arr[0]) {
			case "push_front":
				deq.addFirst(Integer.parseInt(arr[1]));
				break;
			case "push_back":
				deq.addLast(Integer.parseInt(arr[1]));
				break;
			case "pop_front":
				if(deq.size() > 0)
					bw.write(Integer.toString(deq.pollFirst()) + "\n");
				else
					bw.write("-1\n");
				break;
			case "pop_back":
				if(deq.size() > 0)
					bw.write(Integer.toString(deq.pollLast()) + "\n");
				else
					bw.write("-1\n");
				break;
			case "size":
				bw.write(Integer.toString(deq.size()) + "\n");
				break;
			case "empty":
				bw.write(deq.isEmpty() ? "1\n" : "0\n");
				break;
			case "front":
				if(deq.size() > 0)
					bw.write(Integer.toString(deq.peekFirst()) + "\n");
				else
					bw.write("-1\n");
				break;
			case "back":
				if(deq.size() > 0)
					bw.write(Integer.toString(deq.peekLast()) + "\n");
				else
					bw.write("-1\n");
				break;
			default:
				break;
			}
		}
		
		bw.flush();
		bw.close();
	}

}
