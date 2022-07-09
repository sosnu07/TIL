var x = 5;          // 숫자형(number)
var y = 'five';     // 문자형(String)
var isTure = true;  // 불린형(Boolean)
var empty = null;   // null
var nothing         // undefined
var sym = Symbol('me');     // Symbol => 상수타입?

var item = {
    price : 5000,
    count : 10
};  // 객체(object)

var fruits = ['apple', 'banana', 'orange', 'kiwi'];     // 배열(Array)
var addfruits = function (a, b) {
    fruits.push(a, b);
}   // 함수(function)
addfruits('watermelon', 'oriental melon');
fruits.push('pear');

console.log(fruits);