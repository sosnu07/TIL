document.createElement('div');
var element_div = document.createElement('div');
element_div.id = 'div_name'


/**
 * document.createElement('div')를 입력하면, 'div'로 지정된 태그 이름으로 div 엘리먼트가 생성됨
 *
 * var 키워드로 변수 element_div에 document.createElement('div')를 대입하여 입력하면, 변수의 값이 출력되지 않고 undefined가 보임.
 * 이는 브라우저 내부 메모리에 변수 div를 저장했기 때문.
 *
 * element_div.id에 'div_name'을 대입하면 "div_name"이 출력됨. 이는 기존에 선언한 변수 element_div를 이용하여, div 태그에 id를 추가한 것과 동일.
 */

