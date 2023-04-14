function solution(n) {
    return n.toString().split('').map(item => Number(item)).reduce((acc,val)=>acc+val,0);
}