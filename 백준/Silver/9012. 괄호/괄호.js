const input = require("fs").readFileSync('/dev/stdin').toString().trim().split('\n');
input.shift();
let [left,right] = [0,0];
console.log(input.map((items) => {
    const value = items.split('').map(item => {
        if(item === '(') left++;
        else right++;
        if(left < right) return "NO";
    })
    if (left !== right) value.push("NO");
    [left,right] =[0,0];
    return value;
}).map(item => item.includes("NO") ? "NO" : "YES").join('\n'));