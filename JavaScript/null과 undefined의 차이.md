## null과 undefined의 차이


`null`과 `undefined`는 등록, 저장 여부의 차이. 

`null`은 변수를 선언하고 빈 값을 할당받은 상태. 

`undefined`는 변수를 선언하고 값을 할당하지 않은 상태. 

```javascript
null == undefined;          //true
null === undefined;         // false
typeof null;                // "object", 구현버그랍니다~
typeof undefined;           // "undefined"
!null;                      // true
null + 1;                   // 1, 빈 통에 1을 넣어줬으니 1이 등장
undefined + 1;              // NaN

let a;
console.log(a);             // undefined
```


## undefined
`undefied`는 원시값(Primitive Type)으로 선언한 후에 값을 할당하지 않은 변수나 값이 주어지지 않은 인수에 자동으로 할당된다．
이 값은 전역 객체의 속성 중 하나로, 전역 스코프에서의 변수이기도 하다. 따라서 `undefined` 변수의 초기값은 `undefined` 원시 값이다. 

> `undefined`는 예약어가 아니라서 전역 범위 외에서 변수 이름으로 사용하는 것이 가능. 이렇게 되면 차후 사고가 발생할 수 있으니 조심.

<span style="background-color:#fff5b1">**아래의 경우, 변수가 `undefined`를 반환**</span>
* 값을 할당하지 않은 변수
* 메서드와 선언에서 변수가 할당받지 않은 경우
* 함수가 값을 리턴하지 않았을 때. 

### 추가 삽입
* <span style="background-color:#fff5b1">선언된 변수는 암묵적으로 `undefiend`로 초기화된다.</span> 
* 변수가 선언되고 할당된 메모리 공간은 메모리가 할당(초기화)될 때까지 빈 상태로 유지될 것 같지만, 자바스크립트 엔진은 이를 `undefined`로 할당(초기화)시켜버린다. 
* 사실 할당이 이루어질때 까지는 비어있다기 보다 쓰레기 값이 들어있다고 보는 것이 알맞긴 하다. 
* <span style="background-color:#fff5b1">이처럼 `undefined`는 개발자가 의도적으로 할당해둔 값이 아니라, 자바스크립트 엔진이 변수를 초기화할 때 사용하는 값이다.</span> 
* 따라서 의도적으로 `undefined`를 사용하는 경우 어느 부분에서 초기화가 이루어지지 않았는지 디버깅하기 힘들기 때문에 권장사항이 아님. (그냥 하지말자 그런짓은...)
* 그래서 의도적으로 변수에 값이 들어있지 않다고 표시하고 싶은 경우에는 `null`을 사용한다. 

### 선언과 정의
* `undefined`를 직역하면 _정의되지 않은_ 이라는 뜻이다. 
* Javascript에서 사용되는 `undefiend`에서 말하는 정의란 **변수의 값을 할당하면서 변수의 실체를 명확히 하는것**을 의미한다. 
* <span style="background-color:#fff5b1">자바스크립트의 경우 변수를 선언하면 암묵적으로 정의가 이루어지기 때문에 선언과 정의의 경계가 모호하다.</span> 
* <span style="background-color:#fff5b1">ECMAScript 사양에서 변수는 **선언한다.** 라고 표현하고, 함수는 **정의한다.** 라고 표현한다.</span> 

## null
`null`은 원시값(Primitive Type) 중 하나로, 어떤 값이 의도적으로 **비어있음**을 의미한다.(의도적 부재)
<span style="background-color:#fff5b1">`undefined`는 값이 지정되어 있지 않음을 의미한다면, `null`은 해당 변수가 어떤 객체도 가리키고 있지 않음을 의미.</span> 

> `null`은 `undefined`처럼 전역 객체의 속성 중 하나가 아니라 리터럴 값이다.


### 추가 삽입
* 변수에 `null`을 할당하는 것은 변수가 이전에 참조하던 값을 더이상 참조하지 않겠다는 의미. 
* 이는 이전에 할당되어 있던 값에 대한 참조를 명시적으로 제거하는 것을 의미하며, 자바스크립트 엔진은 누구도 참조하지 않은 메모리 공간에 대해 **가비지 컬렉션**을 수행. 
---

## 정리

* `null`은 빈 값. `undefined`는 선언만되고 할당되지 않은 값.
* Javascript에서 할당되지 않은 값을 발견하면 `undefined` 처리. 개발자가 의도적으로 빈 값 처리를 하고 싶을 때는 `null`값 처리.
* `typeof undefined`는 출력하면 `undefined`로 나옴
* `typeof null`은 출력하면 `object`로 나옴. 하지만 이는 여전히 원시타입(Primitive Type)으로, Javascript에서는 구현 버그로 간주. 
* `undefined == null // true`
* `undefined === null // false`

