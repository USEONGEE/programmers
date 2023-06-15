function solution(num_list) {
    let odd = '';
    let even = '';
    num_list.forEach((value) => value%2 ? odd = odd + value : even = even + value)
    return +odd + (+even);
}