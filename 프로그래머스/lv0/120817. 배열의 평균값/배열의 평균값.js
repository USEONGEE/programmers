function solution(numbers) {
    return numbers.reduce((last,now) => last+now, 0)/numbers.length;
}