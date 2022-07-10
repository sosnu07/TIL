function catName1(name) {
    console.log("제 고양이의 이름은 " + name + " 입니다.");
}

catName1("누리");

// => 일반적인 코드 작성 순서.

catName2("클로이");

function catName2(name) {
    console.log("제 고양이의 이름은 " + name + " 입니다.");
}

// => hoisting 방식

console.log(num); // 호이스팅한 var 선언으로 인해 undefined 출력
var num; // 선언
num = 6; // 초기화

//

console.log(num); // ReferenceError
num = 6; // 초기화

//

// console.log(test1);
// let test1;

//

// console.log(test1);
// const test1;

//

// console.log(typeof test);

