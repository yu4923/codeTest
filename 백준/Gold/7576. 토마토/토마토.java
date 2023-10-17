import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[n][m];
		
		Queue<int[]> que = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
				if(num == 1) {
					int[] arr2 = {i, j};
					que.add(arr2);
				}
			}
		}
		
		int times = 0;
		while(que.isEmpty() == false) {
			int change = 0;
			int size = que.size();
			for(int k = 0; k < size; k++) {
				int[] arr2 = que.poll();
				int i = arr2[0];
				int j = arr2[1];
				
				if(i - 1 >= 0 && arr[i - 1][j] == 0) {
					arr[i - 1][j] = 1;
					int[] arr3 = {i - 1, j};
					que.add(arr3);
					change = 1;
				}
				if(i + 1 < n && arr[i + 1][j] == 0) {
					arr[i + 1][j] = 1;
					int[] arr3 = {i + 1, j};
					que.add(arr3);
					change = 1;
				}
				if(j - 1 >= 0 && arr[i][j - 1] == 0) {
					arr[i][j - 1] = 1;
					int[] arr3 = {i, j - 1};
					que.add(arr3);
					change = 1;
				}
				if(j + 1 < m && arr[i][j + 1] == 0) {
					arr[i][j + 1] = 1;
					int[] arr3 = {i, j + 1};
					que.add(arr3);
					change = 1;
				}
			}
			times += change;
		}
		
		int check = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				check *= arr[i][j];
			}
		}
		
		System.out.println(check == 0 ? -1 : times);
		
		sc.close();
	}

}