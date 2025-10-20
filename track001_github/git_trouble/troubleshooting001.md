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