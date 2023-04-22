function solution(a, b) {
    const A = Number(a.toString() + b.toString());
    const B = Number(b.toString() + a.toString());
    return A>B?A:B
}