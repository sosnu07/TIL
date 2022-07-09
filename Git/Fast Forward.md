# fast-forward란?

* `branch`간의 `merge`는 `commit`이 생겨나는 방법과 생겨나지 않는 방법으로 나뉜다. 

## fast forward 

우선 `master branch`와 `dev1 branch`가 각각 존재한다고 가정해보자.
이 두 브랜치가 공통으로 가지는 commit을 `base`라고 한다. 즉, 두 브랜치의 공통조상인 것이다.

그런데 `master`와 `dev1`이 참조하는 commit은 동일선상에 위치하고 있다. 이 때 두 브랜치를 `fast-forward` 상태에 있다고 이야기한다.

![fast-forward](https://wikidocs.net/images/page/153693/05.03.01.jpg)

fast-forward 관계에 있는 브랜치를 `git merge`를 입력하여 병합하면 **새로운 commit이 발생하지 않는다.** 
뒤에 쳐진 브랜치(여기서는 master 브랜치를 가리킴)의 참조 개체가 앞서있는 브랜치가 가리키는 개체를 참조하도록 **head**만 이동할 뿐이다.

마치 브랜치가 점프하듯 상대 브랜치 참조값으로 이동하는 모습을 본따서 **fast-forward(빨리감기)** 라고 한다.


![fast-forward](https://wikidocs.net/images/page/153693/05.03.02.jpg)






---
### reference

[git merge에서 fast forward 관계 이해하기](https://otzslayer.github.io/git/2021/12/05/git-merge-fast-forward.html)

[git wiki - merge의 종류: fast-forward, 3-way-merge](https://wikidocs.net/153693)