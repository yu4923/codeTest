import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		bw.write("<" + Integer.toString(k));
		for(int i = 1; i <= n; i++) {
			if(i % k == 0) {
				if(i == k)
					continue;
				bw.write(", " + Integer.toString(i));
			} else {
				que1.add(i);
			}
		}
		
		int index = n % k + 1;
		boolean isOne = true;
		while(que1.size() + que2.size() > 0) {
			bw.write(", ");
			for(; index <= k; index++) {
				if(que1.size() == 0)
					isOne = false;
				else if(que2.size() == 0)
					isOne = true;
				
				if(isOne) {
					if(index == k) {
						bw.write(Integer.toString(que1.poll()));
					} else {
						que2.add(que1.poll());
					}
				} else {
					if(index == k) {
						bw.write(Integer.toString(que2.poll()));
					} else {
						que1.add(que2.poll());
					}
				}
			}
			index = 1;
		}
		bw.write(">");
		bw.flush();
		bw.close();
	}
}