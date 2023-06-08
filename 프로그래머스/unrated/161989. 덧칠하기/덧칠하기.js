function solution(n, m, section) {
    let count = 0;
    while(section.length > 0) {
        let start = section[0];
        for(let i = start; i < start + m; i++) {
            if(section.includes(i)) {
                section.shift();
            }
        }
        count++;
    }
    return count;
}