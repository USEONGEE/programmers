const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const size = input.length;
const obj = {};
const answer = [];

for (let tree of input) {
  obj[tree] = obj[tree] ? obj[tree] + 1 : 1;
}

for (let tree in obj) {
  const total = obj[tree];
  obj[tree] = ((total * 100) / size).toFixed(4);
  answer.push(`${tree} ${obj[tree]}`);
}
console.log(answer.sort().join('\n'));