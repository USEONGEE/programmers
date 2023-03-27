import math as m

def solution(num, total):
    answer = []
    start = m.ceil(total/num) - m.floor(num/2)
    for i in range(num) :
        answer.append(start)
        start = start+1
    return answer