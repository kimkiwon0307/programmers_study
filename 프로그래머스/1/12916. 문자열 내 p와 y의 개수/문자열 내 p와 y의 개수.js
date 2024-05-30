function solution(s){
    var answer = true;
  
    let str1 = s;
    let lowerstr1 = str1.toLowerCase()
    let arraystr1 = lowerstr1.split("");
    let data1 = 0
    let data2 = 0

    for(let i = 0; i<arraystr1.length; i++) {
        if(arraystr1[i] === "p"){
            data1++
        }
        if(arraystr1[i] ==='y') {
            data2++
        }
    }
if(data1 === data2){
    answer = true;
  console.log(true); 
}else if(data1 === 0 && data2 === 0 ) {
  console.log(true)
     answer = true;
} else {
  console.log(false)
     answer = false;
}
    // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    console.log('Hello Javascript')

    return answer;
}