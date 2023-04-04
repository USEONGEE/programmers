function solution(array) {
    var answer = 0;
    arr = array.map(num => String(num));
    for(let i of arr) {
        for(let j of i) {
            if (j == '7')
                answer = answer + 1;
        }
    }
    return answer;
}