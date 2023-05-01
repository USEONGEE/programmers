const input = require("fs").readFileSync('/dev/stdin').toString();
let result = '';
for (let i = 0; i < input.length; i++) {
    const value = input.charCodeAt(i);
    if(value >= 65 && value <= 77) {
        result += String.fromCharCode(value + 13);
        continue;
    }
    if(value >= 78 && value <= 90) {
        result += String.fromCharCode(value - 13);
        continue;
    }
    if(value >= 97 && value <= 109) {
        result += String.fromCharCode(value + 13);
        continue;
    }
    if(value >= 110 && value <= 122) {
        result += String.fromCharCode(value - 13);
        continue;
    }
    result += input[i]
}

console.log(result);