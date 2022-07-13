var subject = "자바 스크립트";
var x = "다 한거니?";
var input = prompt()
switch (x) {
    case "C언어":
        console.log("초보자를 위한 C++ 200제");
        break;
    case "자바 스크립트":
        console.log("초보자를 위한 자바스크립트 200제");
        break;
    case "파이썬":
        console.log("초보자를 위한 파이썬 200제");
        break;
    case "자바":
        console.log("초보자를 위한 자바 200제");
        break;
    default:
        console.log("이젠 초보자가 아닙니다");
        setTimeout(function (){console.log("진짜..?")}, 1000);
        break;
}