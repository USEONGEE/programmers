function solution(name, yearning, photo) {
    const di = {};
    name.forEach((item,index)=>di[item] = yearning[index]);
    return photo.map(item =>item.filter(item=>Object.keys(di).includes(item)).reduce((acc,val)=>acc+di[val],0))
}