import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 컴퓨터의 수
		int m = sc.nextInt(); // 컴퓨터 쌍의 수
		int[][] arr = new int[n][n];
		int[] check = new int[n];
		Queue<Integer> que = new LinkedList<>();
		que.add(1);
		check[0] = 1;
		
		for(int i = 0; i < n; i++) {
			arr[i][i] = 1;
		}
		
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a - 1][b - 1] = 1;
			arr[b - 1][a - 1] = 1;
		}
		
		while(que.isEmpty() == false) {
			int num = que.poll();
			for(int i = 0; i < n; i++) {
				if(arr[num - 1][i] == 1 && check[i] == 0) {
					que.add(i + 1);
					check[i] = 1;
				}
			}
		}
		
		int sum = 0;
		for(int i = 1; i < n; i++) {
			sum += check[i];
		}
		System.out.println(sum);
		
		sc.close();
	}

}