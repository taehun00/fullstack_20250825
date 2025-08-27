# 🚀 성태훈 | 풀스택 개발자 포트폴리오

> 틀에 얽매이지 않고 새로운 시도를 두려워하지 않는, 
> **소통을 통한 더 나은 결과를 만드는 개발자**

HTML, CSS, JavaScript를 활용한 UI 구현부터 Node.js, Java 기반의 서버 개발까지 폭넓은 경험


---
## Contact & Link
<!--![프로필](./track001_github/me.png) -->
<img src = "./track001_github/me.png" alt = "프로필" width = "100">

| 항목       | 내용 |
|------------|------|
| 이름       | 성태훈 |
| 이메일     | iiss07007@gmail.com |
| 깃허브 주소 | [https://github.com/taehun00](https://github.com/taehun00) |
| 포트폴리오 |  |

---

## 🎯 Golds
- Github에 핵심기능 이해하고 버전 관리 역량
- markdown을 활용한 **문서를 체계적으로 작성**
- github 워크플로우를 통해 **효율적인 협업 방식 경험**
- ai 도구를 활용한 개발 환경 경험

---

## 💻 기술스택 기반 cs역량

- **GitHub**를 활용한 버전 관리 및 협업 경험  
- **Markdown**을 통한 개발 문서 작성 및 정보 구조화 능력  
- **Visual Studio** 환경에서의 프로젝트 구성 및 디버깅 역량  
- **HTML5** 기반의 웹 구조 설계 및 시맨틱 마크업 이해  
- **CSS3**를 활용한 반응형 디자인 및 스타일링 구현 능력  
- **AI 프롬프트** 엔지니어링을 통한 도구 활용 및 문제 해결 접근

---

## 포트폴리오

---

## 🛠️ 트러블슈팅 기록
<div  style="background-color:rgba(0,0,0,0.15); padding:20px; border-radius:30px; box-shadow:0 0 5px rgba(0,0,0,0 5)">

- [트러블슈팅 01: 커밋 오류와 해결방안](./troubleshooting001.md)

### **문제점**
```bash
$ git commit -m "git 수정 후 다시올리기"
On branch master
Changes not staged for commit:
  modified:   day001.md
no changes added to commit
```

### **해결방안**
###### 수정된 파일을 스테이지에 추가
```bash
git add day001.md
```

###### 커밋 실행
```bash
git commit -m "git 수정 후 다시 커밋"
```

### **느낀점**
- 단순한 실수라도 Git은 정확하게 상태를 판단하므로, 작업 흐름을 꼼꼼히 확인하는 습관이 중요함

</div>

<br/>
<br/>

<div  style="background-color:rgba(0,0,0,0.15); padding:20px; border-radius:30px; box-shadow:0 0 5px rgba(0,0,0,0 5)">

### **문제점**
```bash
! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/taehun00/fullstack_20250825.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
```

### **해결방안**
###### 원인 분석
```bash
■ 수업 중 작성한 파일은 `.md` 확장자였으나, 집에서 정리한 파일은 `.txt` 확장자였음
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
```

###### 해결 과정
```bash
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
  GitHub에서 최신 파일을 pull하여 로컬에 가져옴
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
  가져온 `.md` 파일에 내용을 추가한 뒤 push하여 정상적으로 반영됨
■ Git은 파일 이름과 확장자를 기준으로 변경 여부를 판단하므로, 서로 다른 파일로 인식됨
  (참고: `.txt` 파일을 `.md`로 확장자만 변경해도 해결 가능했을 것으로 판단됨)
```

### **느낀점**
- Git은 파일의 이름과 확장자까지 엄격하게 관리하므로, 작은 차이도 큰 충돌로 이어질 수 있음
- 실수에서 배우는 것이 많았고, 꼼꼼하게 보는 습관이 생겼음.


</div>
<br/>
<br/>

<div  style="background-color:rgba(0,0,0,0.15); padding:20px; border-radius:30px; box-shadow:0 0 5px rgba(0,0,0,0 5)">

### 문제점
```bash
$ git pull origin master
Auto-merging day002.md
CONFLICT (content): Merge conflict in day002.md
```

### 해결방안
```bash
# 충돌 해결 절차
1. 충돌이 발생한 `day002.md` 파일을 열어 두 버전의 내용을 비교
2. 원하는 내용으로 수정 후 저장
3. 변경사항을 스테이지에 추가: git add .
4. 커밋: git commit -m "충돌 해결 및 병합"
5. 다시 pull하여 최신 상태 유지: git pull origin master
6. 최종적으로 push: git push origin master
```

### **느낀점**
- 앞으로는 작업 전 pull을 먼저 수행하고, 병합 시에는 충돌 가능성을 염두에 두고 작업하는 습관을 들여야겠다고 느꼈음

</div>

---

## 📚 참고문헌

- [Git 공식 문서](https://git-scm.com/doc)  
- [Markdown 가이드](https://www.markdownguide.org/basic-syntax/)  
- [VS Code 공식 사이트](https://code.visualstudio.com/)  
- [AI 프롬프트 작성 팁](https://learn.microsoft.com/en-us/azure/ai-services/openai/how-to/prompt-engineering)