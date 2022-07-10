# var, let, const 차이점

## 변수 선언 방식

### `var`
* 우선 JavaScript에서 가장 기본적으로 나왔던 타입은 `var` 하나 뿐이었다. 

* 하지만 `var`의 경우 같은 변수명이 중복으로 선언되어도 에러가 나지 않고, 가장 최근에 초기화된 값으로 출력되었다.

* 긍정적인 의미에서 보자면 유연하게 변수 선언이 가능한 셈이지만, 사실상 중복 선언으로 인한 에러 발생 가능성이 너무 높기에 리스크가 더 크다고 느껴졌다.

* 그래서 이러한 문제를 해결하기 위해 ES6 이후부터 let와 const가 도입되었다. 
```javascript
var name = "example1";
console.log(name)   // example1

var name = "example2";
console.log(name)   // example2

var name = "example3";
console.log(name)   // example3
```


### `let`

* `let`의 경우에는 `var`과 달리 변수명을 중복으로 선언하면 에러가 발생한다. 
* 하지만 값을 재할당하는 것은 가능하다

```javascript
let name = "example1";
console.log(name);  // example1

let name = "example2";
console.log(name);  // 에러 발생

let name1 = "example2";
console.log(name1)  // example2

name = "example3";  // 값을 재할당.
console.log(name);  // example3
```

### `const`
* `let`의 경우에는 값을 중복으로 선언하면 에러가 발생한다. 하지만 값을 재할당하는 것은 가능하다.  
* 하지만 `const`는 그것도 불가능하다. ( 중복선언 불가, 값 재할당 불가)

```javascript
const first = "example1";
console.log(first);     // example1

const first = "example2";
console.log(first);     // 에러 발생
// SyntaxError: Identifier 'a' has already been declared
// 중복 선언 불가

first = "example3";     // 에러 발생
// Assignment to constant variable.
// 값을 재할당 하는 것도 불가
```
---

## reference

[var, let, const 차이](https://heinafantasy.com/153)

