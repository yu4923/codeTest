class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
		int[] arr = new int[triangle.length];
		arr[0] = triangle[0][0];
		for(int i = 1; i < triangle.length; i++) {
			arr[i] = arr[i - 1] + triangle[i][i];
			for(int j = i - 1; j > 0; j--) {
				arr[j] = arr[j - 1] + triangle[i][j] > arr[j] + triangle[i][j] ? arr[j - 1] + triangle[i][j] : arr[j] + triangle[i][j];
				answer = answer < arr[j] ? arr[j] : answer;
			}
			arr[0] += triangle[i][0];
		}
        return answer;
    }
}