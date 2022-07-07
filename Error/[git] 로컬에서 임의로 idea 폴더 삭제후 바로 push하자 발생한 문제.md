# [git] 로컬에서 임의로 .idea 삭제후 바로 push 하자 발생한 문제


## 문제 상황

* gitignore 를 잘못건드렸는지 인텔리제이의 프로젝트 항목이 싹 안보이는 상황이 발생
* 로컬 폴더에 파일들이 싹다 죽은게 아니라 표시만 안되는 상황
* 보통 이럴땐 .idea 폴더를 조지고나면 해결이 되었어서 일단 로컬에서 삭제후 인텔리제이를 재가동해서 재생성시켜봄
* 그리고 add -A, commit, push 를 했더니 갑자기 에러발생  

```linux
To https://github.com/sosnu07/TIL.git
 ! [rejected]        main -> main (non-fast-forward)
error: failed to push some refs to 'https://github.com/sosnu07/TIL.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

```


## 원인
1. 보통은 `$ git init` 명령어를 통해서 로컬 git 폴더를 초기화시키고 원격 저장소를 연결해서 `pull`을 통해 땡겨오거나 `merge`를 할때 발생하는 문제라고 함. 

2. 원격저장소에서 발생한 변경사항을 커밋했지만 로컬저장소로 가져오지 않은 상황에서 발생하는 문제라고도 한다 ( 원격 저장소와 로컬 저장소의 불일치 )

사실 어쩌다 발생한 문제인지 정확하게 잘 모르겠다. 
문제상황을 설명할때 말했듯이 project 란이 날아가서 이것저것 다 시도해보다가 발생한 문제인지라..

일단 이전에 pull을 한번 땡기기는 했었고, 완전히 문제가 발생한것은 .idea 폴더를 로컬에서 따로 날리고 재생성시킨 뒤 push할때 발생한 것은 맞기 때문에
원격과 로컬 간의 미일치 문제로 발생한 문제가 아닐까 생각만 하고 있을 뿐이다. 

### 공식문서 참고
https://docs.github.com/en/get-started/using-git/dealing-with-non-fast-forward-errors

일단 공식문서를 뒤져봤더니 이 에러는 다른 사람이 같은 `branch`로 `push`를 할때 발생하는 문제라고 한다.

이해를 제대로     못하긴 했는데 
내 branch에 commit이 남아있는 상황에서 다른 사람이 push를 때려버리면 내가 commit 해놓은 내용이 날아가니깐, 그걸 방지하려고 한 refuse 시킨 모양. 

~~**아 제대로 이해 못하니 스팀오르네... ㅜ 다음에 또 이런문제 발생하면 그때 두고보자...**~~

## 해결

일단 나는 아래의 명령어를 통해 해결을 하긴 했다.  
```linux
$ git push origin +main // my branch name is main
```

## 정리 

1. 원격 저장소랑 로컬 저장소의 불일치 상태에서 `push` 하는 바람에 발생한 문제
2. 다른 사람이 같은 `branch`로 `push`를 할때 내 `branch`에서 `commit` 한 내용이 있으면 이에 대한 소실을 막기위해 발생하는 에러

둘 중 한가지가 원인인거 같긴한데 정확히는 모르겠고, 같은 상황을 도출시켜보려고 해도 못하는 상황이니

그냥 다음에 이 에러 한번 더 터지면 그때 봅시다....ㅎ



---

## reference

**해결법을 찾은 블로그** 

https://somjang.tistory.com/entry/Git-rejected-master-master-non-fast-forward-%ED%95%B4%EA%B2%B0-%EB%B0%A9%EB%B2%95

**문제에 대해 분석을 해보고 여러가지 방법으로 시도한 블로그** 

https://velog.io/@rain98/%EA%B9%83%ED%97%88%EB%B8%8C-non-fast-forward-%EC%97%90%EB%9F%AC-%ED%95%B4%EA%B2%B0%ED%95%98%EA%B8%B0

**github 공식문서** 

https://docs.github.com/en/get-started/using-git/dealing-with-non-fast-forward-errors