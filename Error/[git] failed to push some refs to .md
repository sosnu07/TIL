# [git] ![rejected] non-fast-forward ,error: failed to push some refs to ~


## 문제 상황

1. gitignore 를 잘못건드렸는지 인텔리제이의 프로젝트 항목이 싹 안보이는 상황이 발생 
2. 로컬 폴더에 파일들이 싹다 사라진게 아니라 project 에 표시만 안되는 상황 
3. 경험상으로 .idea 폴더를 삭제하고 재실행시키면 .idea 폴더가 초기화되면서 다시 세팅되기에 바로 .idea 폴더 삭제
  * 지인한테 혼남. .idea 폴더 막 지우는거 아니라고...
  * **Project 란에서 파일이 보이지 않는 경우에는 Project Structure 가서 설정하면 보인다고 함** 
4. 그리고 add -A, commit, push 를 했더니 갑자기 에러발생  

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

#### <span style="color:red"> github repo 와 local repo 사이의 내용 불일치 상태에서 push를 할 경우 발생하는 문제. </span>
#### 보통 협업할 때 같은 branch 에 2명 이상의 사람이 push 를 한 경우 종종 발생
* 원격저장소에 **로컬에는 없는 파일이 존재할 경우** 내 파일을 push 할 떄 발생하는 에러
  * 보통은 local 이 origin 보다 파일이 더 많음. 
* **git 의 입장에서는 어느 쪽 repo 가 원본인지 파악을 할 수 없기 때문에 error 를 내는 것.** 
* 원격저장소에서 내 로컬에 저장하지 않은 파일을 pull 한 후 원격저장소에 다시 push 를 진행해야 한다.


### for example...

1. github 에 f1.js 라는 파일이 push 되어있는 상황 
2. 팀원이 같은 branch 에 f2.js 라는 파일을 push.
3. 내가 f1.js 파일을 수정하여 push.
4.ㅇ


이라녀기서너ㅏㅇ리ㅓ 이새끼위애리
ㅈ사태 ㅏㄶ이 이상하나ㅔ


github 에 생성된 원격저장소와 로컬에 생성된 저장소간 공통분모가 없는 상태에서 병합하려는 시도로 인해 발생하는 에러. 

기본적으로 관련 없는 두 저장소를 병합하는 것은 안되도록 설정이 되어있기에 발생하는 것. 

관련이 없는 두 저장소를 병합(merge)하려들면 어느쪽이 원본인지 알 수 없는 상황이 되어버림
=> `3-way-merge`를 통해 해결? 
   * **3-way-merge** 는 서로 다른 branch A와 B. 그리고 이들이 갈라지기 전 공통분모로 존재하는 C 


1. 보통은 `$ git init` 명령어를 통해서 로컬 git 폴더를 초기화시키고 원격 저장소를 연결해서 `pull`을 통해 땡겨오거나 `merge`를 할때 발생하는 문제라고 함. 

2. 원격저장소에서 발생한 변경사항을 커밋했지만 로컬저장소로 가져오지 않은 상황에서 발생하는 문제라고도 한다 ( 원격 저장소와 로컬 저장소의 불일치 )

사실 어쩌다 발생한 문제인지 정확하게 잘 모르겠다. 
문제상황을 설명할때 말했듯이 project 란이 날아가서 이것저것 다 시도해보다가 발생한 문제인지라..

일단 이전에 pull을 한번 땡기기는 했었고, 완전히 문제가 발생한것은 .idea 폴더를 로컬에서 따로 날리고 재생성시킨 뒤 push할때 발생한 것은 맞기 때문에
원격과 로컬 간의 미일치 문제로 발생한 문제가 아닐까 생각만 하고 있을 뿐이다. 

### 공식문서 참고
https://docs.github.com/en/get-started/using-git/dealing-with-non-fast-forward-errors

일단 공식문서를 뒤져봤더니 이 에러는 다른 사람이 같은 `branch`로 `push`를 할때 발생하는 문제라고 한다.

이해를 제대로 못하긴 했는데 
내 `branch`에 `commit`이 남아있는 상황에서 다른 사람이 `push`를 때려버리면 내가 commit 해놓은 내용이 날아가니깐, 그걸 방지하려고 한 refuse 시킨 모양. 

~~**아 제대로 이해 못하니 스팀오르네... ㅜ 다음에 또 이런문제 발생하면 그때 두고보자...**~~

## 해결

일단 나는 아래의 명령어를 통해 해결을 하긴 했다.  

```linux
$ git push origin +main // my branch name is main
```

## <span style="color:red"> 여기서 사용한 + 명령어는 사용하지 말자</span>

git doc 에서 push 항목을 살펴보면 ( https://git-scm.com/docs/git-push )

**`+` 명령어와 `--force` 명령어가 동일한 것이라고 나와있다.**

>Pushing an empty <src> allows you to delete the <dst> ref from the remote repository. Deletions are always accepted without a leading  <span style="color:red"> + in the refspec (or --force)</span>, except when forbidden by configuration or hooks.

그러니깐 결국 문제생길것을 감수하고 그대로 밀어버리는 명령어였던 것... 

레퍼런스 블로그에서 이 명령어를 실행하는 바람에 협업할때 다른 사람들이 쓰는 `branch`가 날아갔다고 아우성인걸 보면... 일단 force는 쓰지말자
( 지인들한테도 썼다고 했다가 혼났다 )

**그리고 이렇게 말이 나오는걸 보니 이 에러는 commit 할때 branch가 꼬여서 나오는 문제가 맞는듯 하다**

---
1. 
다른 해결책으로는 `pull`을 할때 `–allow-unrelated-histories` 옵션을 추가해서 관련없는 두 저장소를 병합하도록 허용하는 방식.

git 에서는 서로 관련 기록이 없는 이질적인 두 프로젝트를 병합할때 기본적으로 거부하는데, 원격 저장소의 내용을 끌어오면서 로컬 저장소와 merge할 수 있도록 해주는 기능


```linux
$ git pull origin master --allow-unrelated-histories
```

이후 add, commit, push 하면 정상적으로 작동




## 정리 

1. 원격 저장소랑 로컬 저장소의 불일치 상태에서 `push` 하는 바람에 발생한 문제
2. 다른 사람이 같은 `branch`로 `push`를 할때 내 `branch`에서 `commit` 한 내용이 있으면 이에 대한 소실을 막기위해 발생하는 에러
3. 혼자하는 작업이라면 바로 원격 저장소로 `push --force`하여 밀어버려도 상관없다
   1. 협업중이라면 한쪽 `branch`가 날아갈거라 일단 원격저장소에 있는 내용을 `pull`로 땡기고, 이 과정에서 `--allow-unrelated-histories` 옵션을 추가하여 로컬저장소의 내용을 원격저장소의 내용과 `merge`시켜준다. 
4. 그런데 이러면 로컬에서 `force`하는것과 똑같지 않나 싶은...


**내일 다시 보고 정리하기**

**`3-way-merge` 개념 정리하기** 

---

## reference

 

~~https://somjang.tistory.com/entry/Git-rejected-master-master-non-fast-forward-%ED%95%B4%EA%B2%B0-%EB%B0%A9%EB%B2%95~~

여기 블로그 글은 강제로 밀어버려서 문제 발생의 소지가 높음.

---

**여기 글 참고**

https://devlimk1.tistory.com/147


**이게 제일 설명 잘되어있음**

https://jobc.tistory.com/177

https://sosoeasy.tistory.com/406

**`3-way-merge`개념 설명**

https://wonyong-jang.github.io/git/2021/02/05/Github-Merge.html
