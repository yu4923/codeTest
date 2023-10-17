import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[str.length()];
		char[] charArr = str.toCharArray();
		int answer = 0;
		int now = 0;

		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == '(' && charArr[i + 1] == ')') {
				arr[i] = 0;
				arr[i + 1] = 0;
				i += 1;
			} else {
				if (charArr[i] == '(')
					arr[i] = 1;
				else
					arr[i] = -1;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case -1:
				now -= 1;
				break;
			case 0:
				answer += now;
				i += 1;
				break;
			case 1:
				now += 1;
				answer += 1;
				break;
			}
		}
		
		System.out.println(answer);

		sc.close();
	}

}