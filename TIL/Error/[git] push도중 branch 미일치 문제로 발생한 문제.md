# [git] fatal: The current branch master has no upstream branch.

## 문제상황

### upstream branch 미설정 상황에서 push 를 진행하면서 발생한 문제 
* 보통 깃을 처음 설치하고 원격 저장소를 만들어서 push 를 할때 발생.

```linux
$ git push
fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master
```

## 원인

원격저장소가 기본 branch (upstream branch) 를 가지고 있지 않은 상태에서 push 를 한 것이 원인

친절하게도 `git push --set-upstream origin master` 를 입력하라며 해결책도 같이 제시를 해주고 있다.

>**`git push --set-upstream origin master` 명령어**
> 
> * `upstream`은 가장 근본이 되는 repo 를 뜻함.
> * 기본 저장소(upstream)로 원격저장소(origin)의 master 브랜치를 설정하여 push 한다.



## 해결

1. 우선 에러메세지가 알려주는 대로 `git push --set-upstream origin master` 입력
2. branch 이름을 main 으로 바꾼 뒤 push 시도 
   * 원격 저장소와 로컬 저장소를 따로 생성해둔 경우, 원격 저장소의 branch는 main으로, 로컬 저장소의 branch는 master로 설정된다. 

* 그래도 해결이 안된다면 또 친절하게 원격 저장소를 생성하고 텅텅 빈 페이지에서 github 가 알려주는 명령어를 사용해보자. 
* 친절하게도 **push an existing repository from the command line** 라며 존재하는 저장소에 push 할땐 이 명령어들을 사용하라고 명시하고 있다.
    ```linux
    git remote add origin https://github.com/[personal git repository.git]
    git branch -M main
    git push -u origin main
    ```
  


## 정리

### github 에서 저장소를 처음 생성할 때는 기본 branch ( upstream )를 설정해주어야 한다.

---

## reference

[Git) failed to push some refs to ~ 에러 후기](https://sedangdang.tistory.com/146)

[Git 기본 용어 및 CLI](https://velog.io/@oneofakindscene/Git-%EA%B8%B0%EB%B3%B8-command-line)

[Github에 원격 저장소 만들기](https://siyoon210.tistory.com/13)


