function solution(n) {
    var answer = 0;
    var arr = [];
    for(let i = 0; i <= n / 2; i ++) {
        arr[i] = i * 2;
    }
    arr.forEach(num => answer += num)
    return answer;
}