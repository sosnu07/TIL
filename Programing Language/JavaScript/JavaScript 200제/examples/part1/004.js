console.log('Visual Studio Code로 코드 실행해보기 2');

var a = 5;
var b = 2;
console.log(a+b);

// VScode는 text editor이므로 IDE처럼 자동완성 기능을 제대로 지원하지 않는다
// 그 경우 편의성을 위해 code runner이라는 플러그인을 이용하여 자동완성 기능을 지원해준다.

// 주석에서 발생하는 맞춤법 빨간줄 문제는
// Settings[ ctrl + alt + S ] -> Editor -> Inspections -> Proofreading -> Type -> Process comments 체크 해제