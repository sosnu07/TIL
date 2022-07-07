# git 기능 살펴보는 방법

git command 살펴보다가 재미있는 것들을 발견

우선 https://git-scm.com/book/ko/v2 여기로 가면 Gitpro 라는 책을 pdf로 받을 수 있는게 git 관련해서 읽어보는게 좋을듯

~~**태블릿 사놓길 잘했다**~~


### git help 
> 'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.
See 'git help git' for an overview of the system.

git 에 `git help`라고 명령어를 치면 이렇게 나오는데
`git help -a` 랑 `git help -g` 를 치면 서브커맨드 리스트를 뽑아주고 특정 가이드를 보여준다고 함. 

`git help <command>` 혹은 `git help <concept>`를 입력하면 특정 커맨드에 대한 안내가 나온다고도 함. 

그래서 쳐봤다...!

일단 `git help -a`를 치면 명령여들이 쫘라락 뜨면서 키보드로 한칸씩 내리고 올리고, 페이지 왔다갔다 하면서 사용가능한 커맨드들을 살펴볼 수 있음

내가 당장 필요했던것은 remote 커맨드였어서 계속 내리면서 찾아보니깐 
` remote Manage set of tracked repositories` 이렇게 뜸. 

이 상태에서 나가려고 별짓 다했는데 계속 페이지 이동만 해대서 q 눌려보니 깃 명령어를 입력하는 메인 화면으로 이동함.


`git help remote`를 입력했는데 인텔리제이에서 아무일도 안일어남...?
모지.. 하고 있는데 좀 이따가 보니 html을 하나 켜줌.

>file:///C:/Program%20Files/Git/mingw64/share/doc/git-doc/git-remote.html

아... git doc 찾아서 열어줬구나... 

이거보고 에러 해결합시다 ㅜㅜ

---
reference

https://ifuwanna.tistory.com/263

여기서 나온 
```linux
NAME
       git-remote - Manage set of tracked repositories

SYNOPSIS
       git remote [-v | --verbose]
       git remote add [-t <branch>] [-m <master>] [-f] [--[no-]tags] [--mirror=<fetch|push>] <name> <url>
       git remote rename <old> <new>
       git remote remove <name>
       git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
       git remote set-branches [--add] <name> <branch>...
       git remote get-url [--push] [--all] <name>
       git remote set-url [--push] <name> <newurl> [<oldurl>]
       git remote set-url --add [--push] <name> <newurl>
       git remote set-url --delete [--push] <name> <url>
       git remote [-v | --verbose] show [-n] <name>...
       git remote prune [-n | --dry-run] <name>...
       git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]

DESCRIPTION
       Manage the set of repositories ("remotes") whose branches you track.

OPTIONS
       -v, --verbose
           Be a little more verbose and show remote url after name. NOTE: This must be placed between remote and subcommand.

```

이거 한번 출력해보겠다고 난장판을 피웠는데... 
일단 2년 전 게시글인거 보면 업데이트 되면서 git 명령어에 대한 설명을 doc 레퍼런스로 대체한걸수도 있어서

~~**뭐, 콘솔에서 이 명령어창을 뽑는건 실패했지만 doc에 적힌거라도 찾았으니 만족...**~~

---

어...? 갑자기 remote라는 파일이 생성되어있는데 이거 뭐냐... 여기에 찾던거 나와있네

아 못찾겠다 꾀꼬리... 다음에 찾아보자.. 대체 이거 어디서 생성된거야 대체