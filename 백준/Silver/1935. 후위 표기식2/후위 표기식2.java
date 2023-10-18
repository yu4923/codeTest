import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		double[] val = new double[n];
		Stack<Double> stack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			val[i] = Double.parseDouble(br.readLine());
		}
		
		for(char c : arr) {
			if(c >= 'A' && c <= 'Z') {
				stack.add(val[c - 'A']);
				continue;
			} else {
				double a = stack.pop();
				double b = stack.pop();
				
				switch(c) {
				case '+':
					stack.add(b + a);
					break;
				case '-':
					stack.add(b - a);
					break;
				case '*':
					stack.add(b * a);
					break;
				case '/':
					stack.add(b / a);
					break;
				}
			}
		}
		
		System.out.printf("%.2f\n", stack.pop());

	}

}