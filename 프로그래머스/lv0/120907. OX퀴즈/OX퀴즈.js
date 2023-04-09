function solution(quiz) {
    const result = [];
    const data = quiz.map(item => item.split(' '));
    for(let i of data) {
        switch(i[1]) {
            case '+' :
                if (Number(i[0]) + Number(i[2]) === Number(i[4])) 
                    result.push("O");
                else
                    result.push("X");
                break;
            default :
                if (Number(i[0]) - Number(i[2]) === Number(i[4]))
                    result.push("O");
                else
                    result.push("X");
                break;}  
    }
        
    return result;
}