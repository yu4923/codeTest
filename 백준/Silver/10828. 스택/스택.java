import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		sc.nextLine();

		String[] input = new String[n];
		int x = -1;
		for (int i = 0; i < n; i++) {
			input[i] = sc.nextLine();
		}
		
		for(int i = 0; i < n; i++) {
			if (input[i].length() > 5) {
				x += 1;
				s.push(input[i].split(" ")[1]);
			} else {
				String result = "-1";
				switch (input[i]) {
				case "pop":
					result = x < 0 ? "-1" : s.pop();
					x = x < 0 ? -1 : x - 1;
					break;
				case "size":
					result = Integer.toString(s.size());
					break;
				case "empty":
					result = s.empty() ? "1" : "0";
					break;
				case "top":
					result = x < 0 ? "-1" : s.get(x);
					break;
				default:
					break;
				}
				sb.append(result + "\n");
			}
		}
		System.out.println(sb.toString());

		sc.close();
	}

}