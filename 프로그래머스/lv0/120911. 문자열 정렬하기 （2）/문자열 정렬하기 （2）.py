def solution(my_string):
    my_string = my_string.lower()
    li = []
    result = ''
    for i in my_string :
        li.append(i)
    li.sort()
    for i in li :
        result = result + i
    return result