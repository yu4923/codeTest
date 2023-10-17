import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		if (n < 4) {
			switch (n) {
			case 2:
			case 3:
				result = 1;
				break;
			default:
				break;
			}
		} else {
			int[] arr = new int[n + 1];
			arr[2] = 1;
			arr[3] = 1;
			for(int i = 4; i <= n; i++) {
				arr[i] = arr[i - 1] + 1;
				if(i % 3 == 0) {
					arr[i] = arr[i] > arr[i / 3] ? arr[i / 3] + 1 : arr[i];
				}
				if(i % 2 == 0) {
					arr[i] = arr[i] > arr[i / 2] ? arr[i / 2] + 1 : arr[i];
				}
			}
			result = arr[n];
		}
		System.out.println(result);

		sc.close();
	}

}