import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		boolean isNo = false;
		int[] arr = new int[n];
		Stack<Integer> stack = new Stack<>();
		StringBuilder answer = new StringBuilder();
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			if(count <= arr[i]) {
				for(;count <= arr[i]; count++) {
					stack.push(count);
					answer.append("+\n");
				}
			}
			if(count > arr[i]) {
				int k = stack.pop();
				if(Integer.compare(k, arr[i]) == 0) {
					answer.append("-\n");
				} else {
					isNo = true;
					break;
				}
			}
		}
		if(isNo)
			System.out.println("NO");
		else
			System.out.println(answer.toString());
		sc.close();
	}

}