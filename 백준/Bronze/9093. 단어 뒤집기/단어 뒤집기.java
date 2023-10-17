import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		String[][] arr = new String[t][];
		for(int i = 0; i < t; i++) {
			arr[i] = sc.nextLine().split(" ");
		}
		for(int i = 0; i < t; i++) {
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < arr[i].length; j++) {
				char[] chArr = arr[i][j].toCharArray();	
				for(int k = chArr.length - 1; k >= 0; k--) {
					sb.append(chArr[k]);
				}
				sb.append(" ");
			}
			sb.deleteCharAt(sb.length() - 1);
			System.out.println(sb.toString());
		}
		
		sc.close();
	}

}