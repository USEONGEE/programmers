function solution(n) {
    return new Array(n).fill().map((_,i)=>i+1).filter(i=>i%2===1);
}