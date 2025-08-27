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