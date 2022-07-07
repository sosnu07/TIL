# git push 도중 branch 미일치 문제로 발생한 문제

---

## Error message

```linux
$ git push
fatal: The current branch master has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin master
```

## What is the problem?

- 우선 에러메세지 자체를 해석해보자. 
현재 설정된 master 브랜치가 upstream branch를 가지고 있지 않으니 사용하려면 설정하라는 문구다
친절하게도 `git push --set-upstream origin master` 를 입력하라며 해결책도 같이 제시를 해주고 있다. 

- 이는 깃을 처음 설치하고 원격 저장소를 만들어서 push를 할때 발생하는 문제라고 할 수 있는데, 원격 저장소에 대한 기본 레포지토리 설정을 하지 않은것이 원인이라고 할 수 있다. 
- 또한 원격 저장소와 로컬 저장소를 따로 생성하여 푸시하는 경우 branch 이름이 달라서 생기는 문제이기도 하다. 


## How to Solve it?

- 우선 에러메세지가 알려주는 대로 입력했는데도 제대로 작동되지 않는다면 branch 이름을 main으로 바꾼 뒤 push를 해보자. 

- 그래도 해결이 안된다면 또 친절하게 원격 저장소 페이지에서 깃허브라 알려주는 명령어를 사용해보자. 
    ```linux
    git remote add origin https://github.com/[personal git repository.git]
    git branch -M main
    git push -u origin main
    ```
  친절하게도 push an existing repository from the command line 라며 존재하는 저장소에 push 할땐 이 명령어들을 사용하라고 명시하고 있다.



