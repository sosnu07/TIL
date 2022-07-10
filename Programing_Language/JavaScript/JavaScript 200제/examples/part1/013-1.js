var hometown = [
    {name: "남준", place: "일산", city: "고양"},
    {name: "진", place: "과천"},
    {name: "호석", place: "광주", city: "전라도"},
    {name: "지민", place: "부산", city: "경상도"}
]

for (var i = 0; i < hometown.length; i++) {
    var h = hometown[i];
    if (!h || !h.city) continue;

    console.log(i + " 번째 실행입니다.");

    if (h.name === "호석") {
        console.log(h.name + "의 고향은 " + h.city + " " + h.place + " 입니다");
        break;
    }
}

// 코드 해설
// !h => 전체 이외를 뜻하는 것이니 무조건 false, 따라서 !h.city가 true이면 continue를 실행
// !h.city =>  h.city가 존재하는 경우 이외가 true.
// continue는 그 부분을 실행하지 않고 다음 부분으로 넘기는 명령문.

// 따라서 이 코드를 해석하자면..
// 만약 city 항목에 아무것도 없는 경우 띄워넘고 다른 부분들을 실행
// 실행된 항목들은 0번째, 2번째, 3번째 일텐데 그 중에서 만약 이름이 호석이라면 그 부분만 ~ 고향은 ~ 이다 라고 출력한다.

// 잠이오나.. 이거 이해가 안가서 순간 엄청 헤맴....

// ---

// === 연산자는 대체 어디서 튀어나온거람? => 정리좀 해두자.
