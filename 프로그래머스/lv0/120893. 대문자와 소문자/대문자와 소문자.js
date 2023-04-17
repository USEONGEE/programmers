function solution(my_string) {
    return my_string.split('').map(item => item.toUpperCase() === item ? item.toLowerCase() : item.toUpperCase()).join('')
}