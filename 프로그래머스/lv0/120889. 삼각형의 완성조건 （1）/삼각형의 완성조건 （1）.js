function solution(sides) {
    return sides.sort((a,b)=>a-b)[0] + sides[1] > sides[2] ? 1 : 2;
}