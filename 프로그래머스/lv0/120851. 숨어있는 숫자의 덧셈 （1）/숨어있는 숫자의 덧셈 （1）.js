const solution = (s)  => {
    return s.match(/\d+/g).join('').split('').map(i => +i).reduce((a, c) => a + c, 0);
}