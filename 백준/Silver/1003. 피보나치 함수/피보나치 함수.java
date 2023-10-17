import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = max < arr[i] ? arr[i] : max;
		}
		max = max > 2 ? max : 2;
		int[][] arrFibo = new int[max + 1][2];
		arrFibo[0][0] = 1;
		arrFibo[1][1] = 1;
		for(int i = 2; i < max + 1; i++) {
			arrFibo[i][0] = arrFibo[i - 1][0] + arrFibo[i - 2][0];
			arrFibo[i][1] = arrFibo[i - 1][1] + arrFibo[i - 2][1];
		}
		
		for(int k : arr) {
			System.out.println(arrFibo[k][0] + " " + arrFibo[k][1]);
		}
		
		
		sc.close();
	}
}
