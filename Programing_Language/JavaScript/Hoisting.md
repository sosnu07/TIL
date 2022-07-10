# 호이스팅( Hoisting )
* **인터프리터가 변수와 함수의 메모리 공간을 선언 전에 미리 할당하는 것을 의미**
    * `var`로 선언한 변수의 경우 호이스팅시 `undefined`로 변수를 초기화
    * `let`과 `const`로 선언한 변수의 경우, 호이스팅시 변수를 초기화하지 않는다.

* 호이스팅에 대해 설명할 때 주로 "변수의 선언과 초기화를 분리한 후 , 선언만 코드의 최상단에 옮기는 것"으로 설명하곤 한다. 따라서 변수를 정의하는 코드보다 사용하는 코드가 앞서 존재할 수 있다.
    * 다만, 선언과 초기화를 함께 수행하는 경우, 선언 코드까지 실행해야 변수가 초기화된 상태가 됨을 주의해야 한다.

### 일반적인 코드 작성 순서
```javascript
function catName(name) {
    console.log("제 고양이의 이름은 " + name + " 입니다.");
}

catName("누리");
```

### 호이스팅 방식을 이용한 코드 작성 순서
* 함수를 선언하기 전에 먼저 호출
```javascript
catName("클로이");

function catName(name) {
    console.log("제 고양이의 이름은 " + name + " 입니다.");
}
```
* 호이스팅은 다른 자료형과 변수형에서도 잘 작동.
* **변수를 선언하기 전에 초기화하고 사용 가능한 것.**

## 선언만이 호이스팅의 대상으로 존재
* JavaScript에서는 초기화를 제외한 선언만을 호이스팅한다.
* 변수를 먼저 사용하고, 그 후에 선언 및 초기화가 나타나면, 사용하는 시점의 변수는 기본 초기화 상태 (`var`선언 시 `undefined`, 그 외에는 초기화하지 않음)이다.

```javascript
console.log(num);       // 호이스팅한 var 선언으로 인해 undefined 출력
var num;                // 선언
num = 6;                // 초기화
```

---

## reference

[MDN_Hoisting](https://developer.mozilla.org/ko/docs/Glossary/Hoisting)