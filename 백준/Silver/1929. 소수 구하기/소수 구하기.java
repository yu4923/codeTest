import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i < n + 1; i++) {
			if(arr[i] == 1)
				continue;
			for(int j = 2; j * i < n + 1; j++) {
				arr[i * j] = 1;
			}
		}
		
		for(int i = m; i <= n; i++) {
			if(arr[i] == 0)
				System.out.println(i);
		}
		
		sc.close();
	}

}
