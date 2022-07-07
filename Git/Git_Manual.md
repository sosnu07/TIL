# Git bash 기본 명령어 정리

---
* Git 을 공부하면서 사용되는 명령어들을 정리하기 위해 쓴 문서 


## 명령어

---
### 기본 명령어


#### 현재 경로를 보여줌 
   ```linux
   $ pwd   // print working directory
   ```
#### 현재 폴더 내에 있는 폴더 및 파일들을 가로정렬하여 보여줌
   ```linux
   $ dir
   ```

--- 
#### 현재 디렉터리에 있는 파일이나 디렉토리를 확인
   
   - dir 명령어와는 다르게 폴더에는 슬래시(/)가 붙음
   
   ```linux
   $ ls
   ```
    
#### 폴더의 상세 정보까지 같이 출력 
   
```linux
   $ ls -l
   ```
---
#### 숨긴 파일과 디렉터리를 표시

   ```linux
   $ ls -a
   ```
   
* 두 옵션을 함께 사용하려면 '-la' 또는 '-al' 처럼 순서에 상관 없이 글자를 붙여서 추가한다.
   ```linux
   $ ls -la
    ```
#### ls 명령 옵션 모음

|   옵션   |  설명                      |
|:------:|:-------------------------|
|   -a   | 숨김 파일과 디렉터리도 함께 표시       |
|   -l   | 파일이나 디렉터리의 상세 정보를 함께 표시  |
|   -r   | 파일의 정렬 순서를 거꾸로 표시        |
|   -t   | 파일 작성 시간 순으로 (내림차순) 표시한다 |

#### 최상위 디렉터리로 이동  
  
  ```linux
  $ cd  // change directory
   ```

#### 현재 경로로 지정된 디렉토리 내의 디렉터리로 이동
  ```linux
  $ cd [디렉터리명]
  ```
  
#### 부모 디렉터리로 이동
   
   - 리눅스 명령어와는 다르게 cd와 .. 사이를 띄워주어야 한다. 
   ```linux
   $ cd ..
   ```

#### 폴더의 절대경로로 직접 이동
   ```linux
   $ cd [디렉터리 경로]
   ```
   
#### 현재 경로에 새 디렉터리를 생성
   ```linux
   $ mkdir [생성할 디렉터리명]
   ```

#### 현재 경로에서 디렉터리 삭제
  ```linux
  $ rm -r
  ```
  

---

### 깃 파일 및 폴더 삭제하기

#### 로컬 저장소와 원격 저장소 파일 모두 삭제
```linux
git rm 삭제할 파일
git rm -r 삭제할 폴더
```

#### 로컬 저장소 파일만 삭제
```linux
git rm --cached 삭제할 파일
git rm -r --cached 삭제할 폴더
```

>삭제후 commit & push 필수


### git 원격 저장소 연결 및 끊기 (git remote)

#### 현재 연결된 저장소 확인

```linux
$ git remote -v
```

![img.png](img/current_repo.png)

#### 저장소 끊기

```linux
$ git remote remove origin
```
* 연결된 저장소를 확인해보면 없는것이 확인됨 
![img.png](img/chk_del_repo.png)


#### 저장소 연결

```linux
$ git remote add origin 저장소 주소
```
* 연결된 저장소 확인
![img.png](img/chk_current_repo.png)

#### 참고: git remote 명령어 
