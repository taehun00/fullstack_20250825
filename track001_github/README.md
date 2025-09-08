### 1. git  vs  github
- git - 로컬에 파일의 변경이력 ( 내 컴퓨터에 타임머신 )
- github - 클라우드올려서 협업 ( 친구들과 공유작업공간 )

---
### 2. 기본명령어
```bash
`git init`  저장소 생성   ( 빈 상자 만들기 )
`git add .`  변경된 파일추가 ( 상자에 그림넣기 )
`git commit -m "설명" `  저장 ( 그림에 이름붙여 저장 )
```

---
### 3. [실습1] github 회원가입 및 로그인
 -  https://github.com/

---
### 4. [실습2] github 저장소
-  오른쪽상단 - [+] - [New Repository]

---
### 5. [실습3] git
- git-scm.com
- 다운로드 - [설치] 
   - ■ (New!) Add a Git Bash Profile to Windows Terminal

---
### 6. [실습4] git 

6-1.  Gitbash
- 이름, 이메일, 설정정보 
```bash
git  config  --global  user.name  "Tae Hun"
git  config  --global user.email   "iiss07007@gmail.com"
git  config  --list
```
6-2.  git init
- 로컬상자만들기 ★
```bash
vs code - https://code.visualstudio.com/
본인폴더 - [workspace] 폴더만들기
폴더로이동 - 터미널열기  ( ctrl + ` )
git init
```

6-3.  git add .
- 파일만들고 / 상자에 파일넣기  ★

6-4.  git status
- 상태확인

6-5.  git commit  -m "first commit"  
- 뭘저장했는지 이름붙이고 저장  ★

6-6.  git  remote  add  origin   `깃허브주소(원격저장소-공유작업)`

```bash
git remote add origin https://github.com/taehun00/fullstack_20250825.git
```

6-7.  git  remote  -v
- 연결확인

6-8.  git  push origin master
- 원격저장소에 올리기

---
### 7. [실습5] git 수정 후 다시 올리기
```bash
파일수정
git add .
git commit -m "git 수정 후 다시올리기"
git push origin master
```

---
### 8. 트러블슈팅

8-1. 문제코드
```bash
TJ-BU-703-P03@DESKTOP-5CVIKGS MINGW64 /c/KIMYOUNGMIN/workspace (master)
$ git commit -m "git 수정 후 다시올리기"
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)       
        modified:   day001.md

no changes added to commit (use "git add" and/or "git commit -a")
```

8-2. 해결방안
```bash
day001.md 파일은 수정되었지만 아직 Git이 커밋 대상으로 인식하지 못하고 있음.
1. 수정된 파일을 스테이지에 추가 : git add day001.md
2. 커밋 실행 : git commit -m "git 수정 후 다시 커밋"
```
```bash
하지만 오류 해결이 되지 않음.
문제는 파일 수정 후 파일 저장을 안함. 파일 저장 필수(ctrl + s)
```

8-3. 문제코드
```bash
집에서 다시 정리 해서 올리는데 문제가 생겼음
```
```bash
 ! [rejected]        master -> master (fetch first)     
error: failed to push some refs to 'https://github.com/taehun00/fullstack_20250825.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
```

8-4. 해결방안
```bash
수업시간에 메모장 확장자를 .md로 함.
집에서 정리를 하고 나서 메모장 확장자를 .txt로 함.
확장자가 서로 달라 문제가 발생함.

그래서 github에서 pull로 메모장을 가져온 뒤 가져온 메모장에 다시 추가로 정리하여 push 함.
(그냥 .txt를 .md로 바꿔도 해결이 됐을 것 같음.)
```

### 9 ( Chapter2 부터시작)
1. [git-로컬] day002.md 파일만들기 - 제목쓰기
2. [git-로컬] day002.md 파일 올리기 (github)
3. [github]  github에서 day002.md 파일 수정
4. [git-로컬] day002.md 파일수정 후 commit
```bash
git add .
git commit -m "day002.md local 파일수정"
```
5. [git-로컬] `git pull origin main` 충돌 발생
6. 두 개 파일 중 원하는 파일을 선택해서 파일 수정한다.
7. 오류 수정 후 파일상태 저장해서 다시 올리기.
```bash
git add .
git commit -m "day002.md 오류해결완료"
git pull origin master
git push origin master
```

### 10. 기본  markdown 문법 
📁 `track001_github/`  
├── `me2.png` : 프로필 이미지  
├── `markdown.md` : `**마크다운 문법 정리 파일**` 
├── `README.md` : `**프로젝트 소개 및 기술스택 요약**`   

```
# 제목 (제일 큰 제목 - h1)
## 중간 제목
### 작은 제목
#### step4
##### step5
###### step6

<!-- 주석 : 제목 h1~h6 -->
---
🍟🍔  이모지 `윈도우 + .(점)`

---

- 🍟🍔 햄버거세트
- 🍕  피자
- 🌭 핫도그

1. 주문한다
2. 만든다.
3. 커피를먹는다.

---
*기울이기*
**굵은글씨**
~~취소선~~    `~~`

> 말풍선

***`강조`***

```
여러줄 긴코드블록
여러줄을 쓸때 이렇게
```

```java
public class Hello{
    public static void main(String []args){
        System.out.println("Hello");
    }
}
```

[🔗링크걸기](https://github.com/sally03915/fullstack_20250825)

![프로필](./me.png)

```
|이름|나이|
|-|-|
|sally|7살|
|alpha|3살|
```