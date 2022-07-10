/**
 * for-in 반목문
 * @type {{snack: number, beverage: number, flower: number}}
 */


var store = {
    snack: 1000,
    flower: 5000,
    beverage: 2000
};

for (var item in store) {
    if (!store.hasOwnProperty(item)) continue;

    console.log(item + "은 가격이 " + store[item] + "입니다.");
}

// hasOwnProperty()
// 특정 속성값을 가지고 있는지를 bool 값으로 반환하는 메서드
// 여기서는 공부하라고 일부로 혼란스럽게 넣어놓은거 같은데, 이 코드에서는 없어도 if문 없어도 무방.