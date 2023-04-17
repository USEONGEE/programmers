function solution(n) {
    return new Array(n).fill().map((_,i) => i+1).filter(item => n%item ===0);
}