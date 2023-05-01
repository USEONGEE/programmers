const input = require("fs").readFileSync('/dev/stdin').toString().split('\n');

if (input.at(-1) === '') input.pop(); 

const result = input.map(item=> 
    [item.match(/[a-z]/g) ? item.match(/[a-z]/g).length : 0,
    item.match(/[A-Z]/g) ? item.match(/[A-Z]/g).length : 0,
    item.match(/\d/g) ? item.match(/\d/g).length : 0,
    item.match(/\s/g) ? item.match(/\s/g).length : 0].join(' ') 
).join('\n')

console.log(result)